package arsw.CenizasDelPasado.demo.persistence;

import arsw.CenizasDelPasado.demo.model.Room;
import arsw.CenizasDelPasado.demo.exception.CenizasDelPasadpException;


import java.util.List;
import java.util.Map;

public interface RoomPersistence {

    void saveRoom(Room room) throws CenizasDelPasadpException;

    Room getRoom(String code) throws CenizasDelPasadpException;

    Map<String,Room> getAllRooms() throws CenizasDelPasadpException;
}
