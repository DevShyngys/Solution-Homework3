package Assignment1;

import java.util.List;

class Dungeon {
    private final String name;
    private final List<Room> rooms;
    private final List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public void describe() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms: " + rooms.size());
        System.out.println("NPCs: " + npcs.size());
    }
}