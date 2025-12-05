/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.unethicaldevtools;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="entityinspector")
public interface UnethicalDevToolsConfig
extends Config {
    @ConfigSection(keyName="settings", position=0, name="Settings", description="", closedByDefault=true)
    public static final String displayedInfo = "Settings";
    @ConfigSection(keyName="tileObjects", position=1, name="Tile Objects", description="", closedByDefault=true)
    public static final String tileObjects = "Tile Objects";
    @ConfigSection(keyName="actors", name="Actors", description="", position=2, closedByDefault=true)
    public static final String actors = "Actors";
    @ConfigSection(name="Others", keyName="others", description="", position=9, closedByDefault=true)
    public static final String others = "Others";
    @ConfigSection(name="Packet debugger", keyName="packets", description="", position=10, closedByDefault=true)
    public static final String packets = "Packets";
    @ConfigSection(name="Regions", keyName="regions", description="", position=4, closedByDefault=true)
    public static final String regions = "regions";
    @ConfigSection(keyName="interaction", name="Interaction", description="", position=5, closedByDefault=true)
    public static final String interaction = "interaction";

    @ConfigItem(keyName="ids", name="IDs", description="Show ids", section="Settings", position=1)
    default public boolean ids() {
        return true;
    }

    @ConfigItem(keyName="names", name="Names", description="Show names", section="Settings", position=2)
    default public boolean names() {
        return true;
    }

    @ConfigItem(keyName="actions", name="Actions", description="Show actions", section="Settings", position=3)
    default public boolean actions() {
        return true;
    }

    @ConfigItem(keyName="locations", name="World locations", description="Show world locations", section="Settings", position=4)
    default public boolean worldLocations() {
        return true;
    }

    @ConfigItem(keyName="indexes", name="Indexes (Actors)", description="Show indexes", section="Settings", position=5)
    default public boolean indexes() {
        return true;
    }

    @ConfigItem(keyName="animations", name="Animations", description="Show animations", section="Settings", position=6)
    default public boolean animations() {
        return true;
    }

    @ConfigItem(keyName="graphics", name="Graphic (Actors)", description="Show graphics", section="Settings", position=7)
    default public boolean graphics() {
        return true;
    }

    @ConfigItem(keyName="quantities", name="Quantities (TileItems)", description="Show quantities", section="Settings", position=8)
    default public boolean quantities() {
        return true;
    }

    @ConfigItem(keyName="trueWorldLocations", name="True world locations", description="Show true world locations in instances", section="Settings", position=9)
    default public boolean trueWorldLocations() {
        return false;
    }

    @ConfigItem(keyName="gameObjects", name="Game Objects", description="Render Game Objects", section="Tile Objects")
    default public boolean gameObjects() {
        return false;
    }

    @ConfigItem(keyName="decorObjects", name="Decorative Objects", description="Render Decorative Objects", section="Tile Objects")
    default public boolean decorObjects() {
        return false;
    }

    @ConfigItem(keyName="wallObjects", name="Wall Objects", description="Render Wall Objects", section="Tile Objects")
    default public boolean wallObjects() {
        return false;
    }

    @ConfigItem(keyName="groundObjects", name="Ground Objects", description="Render Ground Objects", section="Tile Objects")
    default public boolean groundObjects() {
        return false;
    }

    @ConfigItem(keyName="tileItems", name="TileItems", description="Render Tile Items", section="Tile Objects")
    default public boolean tileItems() {
        return false;
    }

    @ConfigItem(keyName="npcs", name="NPCs", description="Render NPCs", section="Actors")
    default public boolean npcs() {
        return false;
    }

    @ConfigItem(keyName="players", name="Players", description="Render Players", section="Actors")
    default public boolean players() {
        return false;
    }

    @ConfigItem(keyName="projectiles", name="Projectiles", description="Render Projectiles", section="Others")
    default public boolean projectiles() {
        return false;
    }

    @ConfigItem(keyName="graphicsObjects", name="Graphics Objects", description="Render Graphics Objects", section="Others")
    default public boolean graphicsObjects() {
        return false;
    }

    @ConfigItem(keyName="inventory", name="Inventory", description="Render Inventory", section="Others")
    default public boolean inventory() {
        return false;
    }

    @ConfigItem(keyName="tileLocation", name="Tile Location", description="Render Tile Location", section="Others")
    default public boolean tileLocation() {
        return false;
    }

    @ConfigItem(keyName="path", name="Last path", description="Render calculated Path", position=200, section="Others")
    default public boolean path() {
        return false;
    }

    @Range(max=2)
    @ConfigItem(keyName="staffLevel", name="Staff level", description="Used for jmod debugging tools", position=201, section="Others")
    default public int staffLevel() {
        return 0;
    }

    @ConfigItem(keyName="packets", name="Client Packets", description="Packets", position=202, section="Packets")
    default public boolean packets() {
        return false;
    }

    @ConfigItem(keyName="serverPackets", name="Server Packets", description="Server Packets", position=203, section="Packets")
    default public boolean serverPackets() {
        return false;
    }

    @ConfigItem(keyName="opcodes", name="Opcodes", description="Opcodes to log", position=204, section="Packets")
    default public String opcodes() {
        return "";
    }

    @ConfigItem(keyName="hexDump", name="Hex dump", description="Create a hex dump of the payload", position=205, section="Packets")
    default public boolean hexDump() {
        return false;
    }

    @Range(max=3)
    @ConfigItem(keyName="collisionOverlayPlane", name="Collision overlay plane", description="Collision overlay plane", position=1, section="regions")
    default public int collisionOverlayPlane() {
        return 0;
    }

    @ConfigItem(keyName="collisionOverlay", name="Show collision overlay", description="Show collision overlay", position=2, section="regions")
    default public boolean collisionOverlay() {
        return false;
    }

    @ConfigItem(keyName="transportsOverlay", name="Show transports overlay", description="Show transports overlay", position=3, section="regions")
    default public boolean transportsOverlay() {
        return false;
    }

    @ConfigItem(keyName="pathOverlay", name="Show path overlay", description="Show path overlay", position=4, section="regions")
    default public boolean pathOverlay() {
        return false;
    }

    @ConfigItem(keyName="drawMouse", name="Draw mouse events", description="Draws the sent mouse events on screen", section="interaction", position=7)
    default public boolean drawMouse() {
        return false;
    }

    @ConfigItem(keyName="debugMenuAction", name="Debug menu actions", description="Debugs attempted menu actions to the console", section="interaction", position=8)
    default public boolean debugMenuActions() {
        return false;
    }

    @ConfigItem(keyName="debugDialogs", name="Debug dialog interactions", description="Debugs chat dialog actions to console", section="interaction", position=9)
    default public boolean debugDialogs() {
        return false;
    }
}

