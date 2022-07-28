package creational.builder;

import java.util.List;
import lombok.Data;

@Data
public class House {
    List<Room> rooms;

    House(List<Room> rooms) {
        this.rooms = rooms;
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public static class HouseBuilder {

        private List<Room> rooms;

        HouseBuilder() {
        }

        public HouseBuilder rooms(List<Room> rooms) {
            this.rooms = rooms;
            return this;
        }

        public House build() {
            return new House(rooms);
        }

        public String toString() {
            return "House.HouseBuilder(rooms=" + this.rooms + ")";
        }
    }
}
