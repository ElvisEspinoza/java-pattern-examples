package creational.builder;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderTest {

    public static void main(String[] args) {

        Room kitchen = Room.builder().name("Kitchen").area("20").height("3").build();
        Room mainBedroom = Room.builder().name("Main Bedroom").area("15").height("3").build();

        House house = House.builder().rooms(List.of(kitchen, mainBedroom)).build();

        log.info(house.toString());

    }

}
