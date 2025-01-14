package arsw.CenizasDelPasado.demo.persistence;

import arsw.CenizasDelPasado.demo.exception.CenizasDelPasadpException;
import arsw.CenizasDelPasado.demo.model.Room;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ImplementRoomPersistence implements RoomPersistence{
    public final Map<String,Room> listRoom = new HashMap<>();

    public ImplementRoomPersistence() {
        //NOT IMPLEMENTED
    }

    @Override
    public void saveRoom(Room room) throws CenizasDelPasadpException {
        if(listRoom.containsKey(room.getCode())){
            throw new CenizasDelPasadpException("otra");
        }else{
            listRoom.put(room.getCode(),room);
        }
    }

    @Override
    public Room getRoom(String code) throws CenizasDelPasadpException {
        if(listRoom.containsKey(code)){
            return listRoom.get(code);
        }else{
            throw new CenizasDelPasadpException(CenizasDelPasadpException.ROOM_NOT_EXIST);
        }
    }

    @Override
    public Map<String,Room> getAllRooms()  {
        return  listRoom;
    }
}
