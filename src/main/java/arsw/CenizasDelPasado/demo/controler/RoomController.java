package arsw.CenizasDelPasado.demo.controler;

import arsw.CenizasDelPasado.demo.model.Room;
import arsw.CenizasDelPasado.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/room")
public class RoomController {
    @Autowired
    RoomService rs;

    @PostMapping(value = "/create")
    public ResponseEntity<?> manageCreateRoom(){
        try{
            Room room = new Room();
            rs.addNewRoom(room);
            return new ResponseEntity<>(room,HttpStatus.CREATED);
        }catch (Exception ex){
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error al obtener los planos: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping(value ="/list")
    public ResponseEntity manageGetAllRooms(){
        try{
            return new ResponseEntity<>(rs.getAllRooms(),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error al obtener los planos: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
