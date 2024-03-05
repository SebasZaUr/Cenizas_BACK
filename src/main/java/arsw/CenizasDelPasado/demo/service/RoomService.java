package arsw.CenizasDelPasado.demo.service;

import arsw.CenizasDelPasado.demo.exception.CenizasDelPasadpException;
import arsw.CenizasDelPasado.demo.model.Room;
import arsw.CenizasDelPasado.demo.persistence.RoomPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public Map<String,Room> getAllRooms() throws CenizasDelPasadpException {
        return rp.getAllRooms();
    }
}
