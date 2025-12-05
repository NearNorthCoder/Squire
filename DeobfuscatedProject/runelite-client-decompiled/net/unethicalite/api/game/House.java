/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 */
package net.unethicalite.api.game;

import com.openosrs.client.game.WorldLocation;
import java.util.Arrays;
import java.util.Objects;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.movement.pathfinder.model.poh.HousePortal;
import net.unethicalite.api.movement.pathfinder.model.poh.JewelryBox;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class House {
    public static final WorldLocation[] HOUSE_LOCATIONS = new WorldLocation[]{WorldLocation.RIMMINGTON_PORTAL, WorldLocation.TAVERLY_POH_PORTAL, WorldLocation.POLLNIVNEACH_POH_PORTAL, WorldLocation.RELLEKKA_POH_PORTAL, WorldLocation.BRIMHAVEN_POH_PORTAL, WorldLocation.YANILLE_POH_PORTAL, WorldLocation.PRIFDDINAS_POH_PORTAL, WorldLocation.HOSIDIUS_POH_PORTAL};
    public static final WorldPoint[] HOUSE_TELEPORT_OUTSIDE_LOCATIONS = new WorldPoint[]{new WorldPoint(2946, 3228, 0), new WorldPoint(2885, 3471, 0), new WorldPoint(3333, 3008, 0), new WorldPoint(2662, 3635, 0), new WorldPoint(2749, 3184, 0), new WorldPoint(2537, 3108, 0), new WorldPoint(3230, 6081, 0), new WorldPoint(1743, 3517, 0)};
    private static int lastDrinkTick;

    public static WorldPoint getOutsideLocation() {
        if (!Game.isLoggedIn()) {
            return null;
        }
        int idx = Vars.getBit(2187);
        if (idx > HOUSE_LOCATIONS.length || idx <= 0) {
            return null;
        }
        WorldPoint teleport = HOUSE_TELEPORT_OUTSIDE_LOCATIONS[idx - 1];
        if (teleport != null) {
            return teleport;
        }
        WorldArea worldArea = HOUSE_LOCATIONS[idx - 1].getWorldArea();
        return worldArea.toWorldPoint().dx(worldArea.getWidth()).dy(worldArea.getHeight() / 2);
    }

    public static TileObject getGloryAmulet() {
        return TileObjects.getNearest(13523);
    }

    public static TileObject getJewelryBox() {
        return TileObjects.getNearest(ti -> Arrays.stream(JewelryBox.values()).anyMatch(jb -> jb.getObjectId() == ti.getId()));
    }

    public static WorldLocation getHouseLocation() {
        if (!Game.isLoggedIn()) {
            return null;
        }
        int idx = Vars.getBit(2187);
        if (idx > HOUSE_LOCATIONS.length || idx <= 0) {
            return null;
        }
        return HOUSE_LOCATIONS[idx - 1];
    }

    public static boolean enter() {
        return TeleportLoader.canEnterHouse() && TeleportLoader.enterHouse();
    }

    public static boolean exit() {
        if (!House.isInside()) {
            return false;
        }
        TileObject portal = TileObjects.getNearest(to -> "Portal".equals(to.getName()) && to.hasAction(new String[]{"Remove"}));
        if (portal == null) {
            return false;
        }
        portal.interact("Enter");
        return true;
    }

    public static boolean isInside() {
        Style style = House.getHouseStyle();
        if (style == null) {
            return false;
        }
        return Locations.isRegionLoaded(style.getRegionId());
    }

    public static Style getHouseStyle() {
        return Style.getCurrent();
    }

    public static Pool getHousePool() {
        TileObject drinkable = TileObjects.getNearest(to -> to.hasAction(new String[]{"Drink"}) && to.getName().toLowerCase().contains("pool"));
        return Pool.forObject(drinkable);
    }

    public static boolean isPoolDrinkUseful() {
        Pool pool = House.getHousePool();
        if (pool == null) {
            return false;
        }
        if (Combat.getSpecEnergy() < 100 && pool.isRestoreSpecialAttack()) {
            return true;
        }
        if (Movement.getRunEnergy() < 90 && pool.isRestoreEnergy()) {
            return true;
        }
        if (Prayers.getMissingPoints() > 0 && pool.isRestorePrayer()) {
            return true;
        }
        if (Combat.getMissingHealth() > 0 && pool.isRestoreHealth()) {
            return true;
        }
        return (Combat.isPoisoned() || Combat.isVenomed()) && pool.isRestoreHealth();
    }

    public static boolean drinkFromPool() {
        Pool pool = House.getHousePool();
        if (pool == null) {
            return false;
        }
        TileObject drinkable = TileObjects.getNearest(to -> to.getName().toLowerCase().contains(pool.getName()));
        if (drinkable == null) {
            return false;
        }
        Client client = Static.getClient();
        if (client.getTickCount() - lastDrinkTick <= 2) {
            return true;
        }
        Player local = Players.getLocal();
        if (((GameObject)drinkable).getWorldArea().isInMeleeDistance(local.getWorldLocation())) {
            lastDrinkTick = client.getTickCount();
        }
        drinkable.interact("Drink");
        return true;
    }

    public static boolean useNexusPortal(HousePortal housePortal) {
        TileObject nexusPortal = TileObjects.getNearest("Portal Nexus");
        if (nexusPortal == null) {
            return false;
        }
        Widget teleportInterface = Widgets.get(17, 12);
        if (teleportInterface == null || teleportInterface.isHidden()) {
            nexusPortal.interact("Teleport Menu");
            return true;
        }
        Widget[] teleportChildren = teleportInterface.getDynamicChildren();
        if (teleportChildren == null || teleportChildren.length == 0) {
            return false;
        }
        Widget teleportWidget = Arrays.stream(teleportChildren).filter(Objects::nonNull).filter(widget -> widget.getText() != null).filter(widget -> widget.getText().contains(housePortal.getNexusTarget())).findFirst().orElse(null);
        if (teleportWidget == null) {
            return false;
        }
        String teleportChar = teleportWidget.getText().substring(12, 13);
        Keyboard.type(teleportChar);
        return true;
    }

    public boolean usePortal(HousePortal housePortal) {
        TileObject portal = TileObjects.getNearest(housePortal.getPortalName());
        if (portal == null) {
            return House.useNexusPortal(housePortal);
        }
        portal.interact(housePortal.getPortalAction());
        return true;
    }

    public static enum Pool {
        RESTORATION("restoration", true, false, false, false, false),
        REVITALISATION("revitalisation", true, true, false, false, false),
        REJUVENATION("rejuvenation", true, false, false, false, false),
        FANCY_REJUVENATION("fancy pool", true, true, true, true, false),
        ORNATE_REJUVENATION("ornate pool", true, true, true, true, true);

        private final String name;
        private final boolean restoreSpecialAttack;
        private final boolean restoreEnergy;
        private final boolean restorePrayer;
        private final boolean restoreStats;
        private final boolean restoreHealth;

        private Pool(String name, boolean restoreSpecialAttack, boolean restoreEnergy, boolean restorePrayer, boolean restoreStats, boolean restoreHealth) {
            this.name = name;
            this.restoreSpecialAttack = restoreSpecialAttack;
            this.restoreEnergy = restoreEnergy;
            this.restorePrayer = restorePrayer;
            this.restoreStats = restoreStats;
            this.restoreHealth = restoreHealth;
        }

        public static Pool forObject(TileObject tileObject) {
            if (tileObject == null) {
                return null;
            }
            Pool[] values = Pool.values();
            for (int i = values.length - 1; i >= 0; --i) {
                Pool pool = values[i];
                if (!tileObject.getName().toLowerCase().contains(pool.getName())) continue;
                return pool;
            }
            return null;
        }

        public String getName() {
            return this.name;
        }

        public boolean isRestoreSpecialAttack() {
            return this.restoreSpecialAttack;
        }

        public boolean isRestoreEnergy() {
            return this.restoreEnergy;
        }

        public boolean isRestorePrayer() {
            return this.restorePrayer;
        }

        public boolean isRestoreStats() {
            return this.restoreStats;
        }

        public boolean isRestoreHealth() {
            return this.restoreHealth;
        }
    }

    public static enum Style {
        BASIC_WOOD(1, 7513),
        BASIC_STONE(2, 7513),
        WHITEWASHED_STONE(3, 7513),
        FREMNERIK_STYLE_WOOD(4, 7513),
        TROPICAL_WOOD(5, 7769),
        FANCY_STONE(6, 7769),
        DEATHLY_MANSION(7, 7769),
        COSY_CABIN(8, 7769),
        TWISTED_THEME(10, 7769),
        HOSIDIUS_HOUSE(11, 7769);

        private final int varbit;
        private final int regionId;

        private Style(int varbit, int regionId) {
            this.varbit = varbit;
            this.regionId = regionId;
        }

        static Style getCurrent() {
            int var = Vars.getBit(2188);
            for (Style value : Style.values()) {
                if (value.varbit != var) continue;
                return value;
            }
            return BASIC_WOOD;
        }

        public int getVarbit() {
            return this.varbit;
        }

        public int getRegionId() {
            return this.regionId;
        }
    }
}

