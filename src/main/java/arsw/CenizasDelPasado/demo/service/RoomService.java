package arsw.CenizasDelPasado.demo.service;

import arsw.CenizasDelPasado.demo.exception.CenizasDelPasadpException;
import arsw.CenizasDelPasado.demo.model.Room;
import arsw.CenizasDelPasado.demo.persistence.RoomPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class RoomService {

    @Autowired
    RoomPersistence rp;

    public RoomService(RoomPersistence rp) {
        this.rp = rp;
    }

    public void addNewRoom(Room room) throws CenizasDelPasadpException {
       rp.saveRoom(room);
    }

    public ArrayList<Room> getAllRooms() throws CenizasDelPasadpException {
        return new ArrayList<>(rp.getAllRooms().values());
    }

    public Room getRoomCode(String code)throws CenizasDelPasadpException{
        return rp.getRoom(code);
    }
}
