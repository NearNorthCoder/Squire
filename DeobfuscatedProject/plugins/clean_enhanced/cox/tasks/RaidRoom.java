/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.GameEnum;
import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.GameEnum2;
import gg.squire.cox.tasks.CoxManager;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

/**
 * RaidRoom - Represents a single room in a Chambers of Xeric raid layout.
 *
 * This class encapsulates all the spatial and type information for a room,
 * including its position, area, direction, and what type of encounter it contains.
 */
public class RaidRoom {
    public N roomType;
    public WorldArea roomArea;
    public J rotationInfo;
    public char nextDirection;
    public WorldPoint basePosition;
    public char currentDirection;
    public S templateDirection;
    public M roomState;
    public WorldPoint exitPosition;
    public WorldPoint entrancePosition;

    static {
        RaidRoom.initializeMapper();
    }

    /**
     * Creates a new raid room.
     *
     * @param roomType the type of room (combat, puzzle, scavenger, etc.)
     * @param basePosition the base world position of the room
     * @param entrancePosition the position of the room entrance
     * @param exitPosition the position of the room exit
     * @param currentDirection the current directional character
     * @param nextDirection the next directional character
     */
    public RaidRoom(N roomType, WorldPoint basePosition, WorldPoint entrancePosition,
                    WorldPoint exitPosition, char currentDirection, char nextDirection) {
        this.roomType = roomType;
        this.basePosition = basePosition;
        this.entrancePosition = entrancePosition;
        this.exitPosition = exitPosition;
        this.roomArea = new WorldArea(basePosition, 16, 16);
        this.roomState = M.RAIDS_EMPTY;
        this.templateDirection = S.getTemplateDirection(currentDirection, nextDirection);
        this.currentDirection = currentDirection;
        this.nextDirection = nextDirection;
    }

    /**
     * Gets the current state of the room.
     *
     * @return the room state
     */
    public M getRoomState() {
        return this.roomState;
    }

    /**
     * Gets the type of this room.
     *
     * @return the room type
     */
    public N getRoomType() {
        return this.roomType;
    }

    /**
     * Checks if the given world point is within this room's area.
     *
     * @param worldPoint the point to check
     * @return true if the point is in this room, false otherwise
     */
    public boolean contains(WorldPoint worldPoint) {
        return this.roomArea.contains(worldPoint);
    }

    /**
     * Checks if the given locatable is within this room's area.
     *
     * @param locatable the locatable to check
     * @return true if the locatable is in this room, false otherwise
     */
    public boolean contains(Locatable locatable) {
        return this.roomArea.contains(locatable);
    }

    /**
     * Sets the room state.
     *
     * @param roomState the new room state
     */
    public void setRoomState(M roomState) {
        this.roomState = roomState;
    }

    /**
     * Calculates the entrance position based on direction.
     *
     * @param direction the direction character
     * @param basePoint the base world point
     * @return the calculated entrance position
     */
    private static WorldPoint calculateEntrancePosition(char direction, WorldPoint basePoint) {
        switch (direction) {
            case 'E':
                return basePoint.dx(7).dy(8);
            case 'W':
                return basePoint.dx(4).dy(8);
            case 'S':
                return basePoint.dx(8).dy(4);
            case 'N':
                return basePoint.dx(8).dy(7);
            default:
                return new WorldPoint(0, 0, 0);
        }
    }

    /**
     * Calculates the exit position based on direction.
     *
     * @param direction the direction character
     * @param basePoint the base world point
     * @return the calculated exit position
     */
    private static WorldPoint calculateExitPosition(char direction, WorldPoint basePoint) {
        switch (direction) {
            case 'E':
                return basePoint.dx(4).dy(8);
            case 'W':
                return basePoint.dx(7).dy(8);
            case 'S':
                return basePoint.dx(8).dy(7);
            case 'N':
                return basePoint.dx(8).dy(4);
            default:
                return new WorldPoint(0, 0, 0);
        }
    }

    /**
     * Creates a list of raid rooms from a raid layout.
     *
     * @param raid the raid layout data
     * @return a list of raid rooms representing the layout
     */
    public static List<RaidRoom> createRoomsFromLayout(a raid) {
        ArrayList<RaidRoom> rooms = new ArrayList<>();
        ArrayList<WorldPoint> positions = new ArrayList<>();
        WorldPoint startPosition = raid.getStartPosition();
        String layout = raid.getLayoutString();

        positions.add(startPosition);

        // Parse the layout string to calculate room positions
        for (int i = 1; i < layout.length(); i++) {
            char direction = layout.charAt(i);
            WorldPoint previousPosition = positions.get(i - 1);

            switch (direction) {
                case 'E':
                    positions.add(previousPosition.dx(16));
                    break;
                case 'W':
                    positions.add(previousPosition.dx(-16));
                    break;
                case 'S':
                    positions.add(previousPosition.dy(-16));
                    break;
                case 'N':
                    positions.add(previousPosition.dy(16));
                    break;
                case '#':
                    positions.add(previousPosition.dz(1));
                    break;
            }
        }

        // Create entrance and exit positions for each room
        ArrayList<WorldPoint> entrancePositions = new ArrayList<>();
        ArrayList<WorldPoint> exitPositions = new ArrayList<>();

        for (int i = 0; i < layout.length(); i++) {
            WorldPoint exitPos = new WorldPoint(0, 0, 0);
            char nextDir = '#';
            if (i + 1 < layout.length()) {
                nextDir = layout.charAt(i + 1);
                exitPos = calculateEntrancePosition(nextDir, positions.get(i));
            }
            exitPositions.add(exitPos);

            WorldPoint entrancePos = new WorldPoint(0, 0, 0);
            char currentDir = '#';
            if (i > 0) {
                currentDir = layout.charAt(i);
                entrancePos = calculateExitPosition(currentDir, positions.get(i));
            }
            entrancePositions.add(entrancePos);

            RaidRoom room = new RaidRoom(
                raid.getRoomTypes().get(i),
                positions.get(i),
                entrancePositions.get(i),
                exitPositions.get(i),
                currentDir,
                nextDir
            );

            if (layout.charAt(i) != '#') {
                room.templateDirection = S.getTemplateDirection(currentDir, nextDir);
            }

            rooms.add(room);
        }

        return rooms;
    }

    /**
     * Initializes the mapper (placeholder for generated code).
     */
    private static void initializeMapper() {
        // Generated initialization code
    }
}
