package Assignment1;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("The Dark Cave")
                .addRoom(new Room("Entrance Hall"))
                .addRoom(new Room("Treasure Chamber"))
                .addNPC(new NPC("Goblin King"))
                .build();

        dungeon.describe();
    }
}