package creational.builder;

import lombok.Data;

@Data
public class Room {
    private final String name;
    private final String area;
    private final String height;

    Room(String name, String area, String height) {
        this.name = name;
        this.area = area;
        this.height = height;
    }

    public static RoomBuilder builder() {
        return new RoomBuilder();
    }

    public static class RoomBuilder {

        private String name;
        private String area;
        private String height;

        RoomBuilder() {
        }

        public RoomBuilder name(String name) {
            this.name = name;
            return this;
        }

        public RoomBuilder area(String area) {
            this.area = area;
            return this;
        }

        public RoomBuilder height(String height) {
            this.height = height;
            return this;
        }

        public Room build() {
            return new Room(name, area, height);
        }

        public String toString() {
            return "Room.RoomBuilder(name=" + this.name + ", area=" + this.area + ", height="
                    + this.height + ")";
        }
    }
}
