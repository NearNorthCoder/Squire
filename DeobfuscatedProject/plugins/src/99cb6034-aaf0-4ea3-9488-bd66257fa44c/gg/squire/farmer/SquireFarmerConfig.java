/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.farmer;

import -.m.e.a.u.s.r.r.q.i.r.e.f.C;
import -.m.e.a.u.s.r.r.q.i.r.e.f.H;
import -.m.e.a.u.s.r.r.q.i.r.e.f.J;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ap;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aq;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ar;
import -.m.e.a.u.s.r.r.q.i.r.e.f.as;
import -.m.e.a.u.s.r.r.q.i.r.e.f.at;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ax;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@ConfigGroup(value="squirefarmer")
public interface SquireFarmerConfig
extends Config {
    public static final /* synthetic */ String AUTOWEED;
    public static final /* synthetic */ String FARM_TICK_OFFSET;
    public static final /* synthetic */ String FARMING_LOCATION_BUSH;
    @ConfigSection(name="Default", description="Default Seeds", position=1, keyName="default")
    public static final /* synthetic */ String DEFAULT;
    public static final /* synthetic */ String FARMING_LOCATION_ALLOTMENT_NORTH;
    public static final /* synthetic */ String CONFIG_GROUP;
    public static final /* synthetic */ String FARMING_LOCATION_ENABLED;
    @ConfigSection(name="General", description="General settings", position=0, keyName="generalSection")
    public static final /* synthetic */ String GENERAL;
    public static final /* synthetic */ String FARM_TICK_OFFSET_PRECISION;
    public static final /* synthetic */ String FARMING_LOCATION_SEAWEED;
    public static final /* synthetic */ String TIME_CONFIG_GROUP;
    @ConfigSection(name="Fossil Island Underwater", description="Fossil Island Underwater settings", position=14, keyName="fossil_island_underwater")
    public static final /* synthetic */ String FOSSIL_ISLAND_UNDERWATER;
    public static final /* synthetic */ String FARMING_LOCATION_BIRDHOUSE;
    @ConfigSection(name="Birdhouses", description="Birdhouse settings", position=15, keyName="birdhouses")
    public static final /* synthetic */ String BIRDHOUSES;
    @ConfigSection(name="Champions Guild", description="Champions Guild settings", position=13, keyName="champions_guild")
    public static final /* synthetic */ String CHAMPIONS_GUILD;
    @ConfigSection(name="Catherby", description="Catherby settings", position=3, keyName="catherby")
    public static final /* synthetic */ String CATHERBY;
    public static final /* synthetic */ String PROTECTED;
    public static final /* synthetic */ String FARMING_LOCATION_FLOWER;
    public static final /* synthetic */ String TIMERS;
    @ConfigSection(name="Farming Guild", description="Farming Guild settings", position=2, keyName="farmingGuild")
    public static final /* synthetic */ String FARMING_GUILD;
    @ConfigSection(name="Grapes", description="Grapevine settings (in kourend)", position=11, keyName="grape_vine_kourend")
    public static final /* synthetic */ String GRAPE_VINE_KOUREND;
    @ConfigSection(name="Trollheim", description="Trollheim settings", position=10, keyName="trollheim")
    public static final /* synthetic */ String TROLLHEIM;
    @ConfigSection(name="Hosidius", description="Hosidius settings", position=4, keyName="hosidius")
    public static final /* synthetic */ String HOSIDIUS;
    @ConfigSection(name="Ardougne", description="Ardougne settings", position=7, keyName="ardougne")
    public static final /* synthetic */ String ARDOUGNE;
    public static final /* synthetic */ String BOTANIST;
    @ConfigSection(name="Weiss", description="Weiss settings", position=9, keyName="weiss")
    public static final /* synthetic */ String WEISS;
    public static final /* synthetic */ String BIRDHOUSE_NOTIFY;
    @ConfigSection(name="Falador", description="Falador settings", position=6, keyName="falador")
    public static final /* synthetic */ String FALADOR;
    public static final /* synthetic */ String PREFER_SOONEST;
    public static final /* synthetic */ String COMPOST;
    @ConfigSection(name="Monastery", description="Monastery settings", position=12, keyName="monastery")
    public static final /* synthetic */ String MONASTERY;
    public static final /* synthetic */ String FARMING_LOCATION_GRAPES;
    @ConfigSection(name="Morytania", description="Morytania settings", position=5, keyName="morytania")
    public static final /* synthetic */ String MORYTANIA;
    public static final /* synthetic */ String FARMING_LOCATION_ALLOTMENT_SOUTH;
    public static final /* synthetic */ String FARMING_LOCATION_BINS;
    public static final /* synthetic */ String FARMING_LOCATION_HERB;
    @ConfigSection(name="Harmony", description="Harmony settings", position=8, keyName="harmony")
    public static final /* synthetic */ String HARMONY;
    public static final /* synthetic */ String STOPWATCHES;
    public static final /* synthetic */ String NOTIFY;
    public static final /* synthetic */ String BIRD_HOUSE;

    @ConfigItem(name="Flower patch", description="What do you want to plant in the flower patch", keyName="trollheim.flower", section="trollheim", position=3, hidden=true)
    default public ar trollheimFlowerPatch() {
        return ar.DEFAULT;
    }

    @ConfigItem(name="Fill compost bin", description="Do you want to fill the compost bin?", keyName="harmony.bins", section="harmony", position=6, hidden=true)
    default public boolean harmonyCompostBin() {
        return ((6 ^ 0x5E ^ (0xBF ^ 0xA1)) & (52 + 8 - -64 + 8 ^ 141 + 128 - 262 + 187 ^ -" ".length())) != 0;
    }

    @ConfigItem(name="Allotment (north)", description="What do you want to plant in the north allotment patch", keyName="grape_vine_kourend.allotment.north", section="grape_vine_kourend", position=4, hidden=true)
    default public ap grapeVinesNorthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Bank Loadout", description="What bank loadout to withdraw at the start of a run?", keyName="bank.loadout", section="General", position=0)
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="fossil_island_underwater.enabled", section="fossil_island_underwater", position=1)
    default public boolean fossil_island_underwater() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Flower", description="Select the default flower you want to plant", keyName="defaults.flower", section="defaults", position=2)
    default public ar defaultFlower() {
        return ar.LIMPWURT;
    }

    @ConfigItem(name="Compost items", description="Select the produce you want to use for making compost", keyName="compostProduce", section="General", position=2)
    default public J compostProduce() {
        return J.WATERMELON;
    }

    @ConfigItem(name="Herb patch", description="What do you want to plant in the herb patch", keyName="grape_vine_kourend.herb", section="grape_vine_kourend", position=2, hidden=true)
    default public at grapeVinesHerbPatch() {
        return at.DEFAULT;
    }

    @ConfigItem(name="Flower patch", description="What do you want to plant in the flower patch", keyName="weiss.flower", section="weiss", position=3, hidden=true)
    default public ar weissFlowerPatch() {
        return ar.DEFAULT;
    }

    @ConfigItem(name="Fill compost bin", description="Do you want to fill the compost bin?", keyName="weiss.bins", section="weiss", position=6, hidden=true)
    default public boolean weissCompostBin() {
        return ((182 + 230 - 253 + 95 ^ 43 + 74 - 2 + 82) & (0x1C ^ 0x75 ^ (0xC2 ^ 0x90) ^ -" ".length())) != 0;
    }

    @ConfigItem(name="Allotment (south)", description="What do you want to plant in the south allotment patch", keyName="weiss.allotment.south", section="weiss", position=5, hidden=true)
    default public ap weissSouthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Grape patch", description="What do you want to plant in the grape patch", keyName="grape_vine_kourend.grapes", section="grape_vine_kourend", position=2, hidden=true)
    default public as grapeVinesGrapeType() {
        return as.GRAPES;
    }

    @ConfigItem(name="Flower patch", description="What do you want to plant in the flower patch", keyName="falador.flower", section="falador", position=3)
    default public ar faladorFlowerPatch() {
        return ar.DEFAULT;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="ardougne.enabled", section="ardougne", position=1)
    default public boolean ardougne() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Allotment (north)", description="What do you want to plant in the north allotment patch", keyName="weiss.allotment.north", section="weiss", position=4, hidden=true)
    default public ap weissNorthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Allotment (north)", description="What do you want to plant in the north allotment patch", keyName="harmony.allotment.north", section="harmony", position=4)
    default public ap harmonyNorthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Fill compost bin", description="Do you want to fill the compost bin?", keyName="catherby.bins", section="catherby", position=6)
    default public boolean catherbyCompostBin() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Allotment", description="Select the default allotment you want to plant", keyName="defaults.allotment.north", section="defaults", position=3)
    default public ap defaultAllotment() {
        return ap.WATERMELON;
    }

    @ConfigItem(name="Allotment (south)", description="What do you want to plant in the south allotment patch", keyName="grape_vine_kourend.allotment.south", section="grape_vine_kourend", position=5, hidden=true)
    default public ap grapeVinesSouthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Allotment (north)", description="What do you want to plant in the north allotment patch", keyName="hosidius.allotment.north", section="hosidius", position=4)
    default public ap hosidiusNorthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Allotment (south)", description="What do you want to plant in the flower patch", keyName="farming_guild.allotment.south", section="farming_guild", position=5)
    default public ap farmingGuildSouthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Flower patch", description="What do you want to plant in the flower patch", keyName="harmony.flower", section="harmony", position=3, hidden=true)
    default public ar harmonyFlowerPatch() {
        return ar.DEFAULT;
    }

    @ConfigItem(name="Flower patch", description="What do you want to plant in the flower patch", keyName="hosidius.flower", section="hosidius", position=3)
    default public ar hosidiusFlowerPatch() {
        return ar.DEFAULT;
    }

    @ConfigItem(name="Apply volcanic ash", description="Do you want to use volcanic ash to make ultra compost?", keyName="volcanicAsh", section="General", position=4)
    default public boolean applyVolcanicAsh() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Allotment (north)", description="What do you want to plant in the north allotment patch", keyName="catherby.allotment.north", section="catherby", position=4)
    default public ap catherbyNorthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Flower patch", description="What do you want to plant in the flower patch", keyName="ardougne.flower", section="ardougne", position=3)
    default public ar ardougneFlowerPatch() {
        return ar.DEFAULT;
    }

    @ConfigItem(name="Bottomless bucket", description="Do you want to use a bottomless bucket?", keyName="bottomless", section="General", position=1)
    default public boolean bottomless() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled", keyName="catherby.enabled", section="catherby", position=1)
    default public boolean catherby() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Allotment (north)", description="What do you want to plant in the north allotment patch", keyName="falador.allotment.north", section="falador", position=4)
    default public ap faladorNorthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Fill compost bin", description="Do you want to fill the compost bin?", keyName="hosidius.bins", section="hosidius", position=6)
    default public boolean hosidiusCompostBin() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Allotment (south)", description="What do you want to plant in the south allotment patch", keyName="catherby.allotment.south", section="catherby", position=5)
    default public ap catherbySouthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="harmony.enabled", section="harmony", position=1)
    default public boolean harmony() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Bush patch", description="What do you want to plant in the bush patch", keyName="champions_guild.bush", section="champions_guild", position=2)
    default public aq champions_guildBushPatch() {
        return aq.DEFAULT;
    }

    @ConfigItem(name="Compost (flowers)", description="Select the compost you want to use for flower patches", keyName="compostTypeFlowers", section="General", position=6)
    default public H compostTypeFlowers() {
        return H.COMPOST;
    }

    @ConfigItem(name="Allotment (south)", description="What do you want to plant in the south allotment patch", keyName="trollheim.allotment.south", section="trollheim", position=5, hidden=true)
    default public ap trollheimSouthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Seaweed patch", description="What do you want to plant in the seaweed patch", keyName="fossil_island_underwater.seaweed", section="fossil_island_underwater", position=2)
    default public ax fossil_island_underwaterSeaweedPatch() {
        return ax.GIANT_SEAWEED;
    }

    @ConfigItem(name="Fill compost bin", description="Do you want to fill the compost bin?", keyName="grape_vine_kourend.bins", section="grape_vine_kourend", position=6, hidden=true)
    default public boolean grapeVinesCB() {
        return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
    }

    @ConfigItem(name="Pick-up spores", description="Do you want to pick up spores that spawn?", keyName="fossil_island_underwater.spores", section="fossil_island_underwater", position=1)
    default public boolean fossil_island_underwaterSpores() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Herb", description="Select the default herb you want to plant", keyName="defaults.herb", section="defaults", position=1)
    default public at defaultHerb() {
        return at.RANARR;
    }

    @ConfigItem(name="Flower patch", description="What do you want to plant in the flower patch", keyName="morytania.flower", section="morytania", position=3)
    default public ar morytaniaFlowerPatch() {
        return ar.DEFAULT;
    }

    @ConfigItem(name="Allotment (north)", description="What do you want to plant in the north allotment patch", keyName="morytania.allotment.north", section="morytania", position=4)
    default public ap morytaniaNorthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Flower patch", description="What do you want to plant in the flower patch", keyName="catherby.flower", section="catherby", position=3)
    default public ar catherbyFlowerPatch() {
        return ar.DEFAULT;
    }

    @ConfigItem(name="Herb patch", description="What do you want to plant in the herb patch", keyName="ardougne.herb", section="ardougne", position=2)
    default public at ardougneHerbPatch() {
        return at.DEFAULT;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="hosidius.enabled", section="hosidius", position=1)
    default public boolean hosidius() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Bush patch", description="What do you want to plant in the bush patch", keyName="monastery.bush", section="monastery", position=2)
    default public aq monasteryBushPatch() {
        return aq.DEFAULT;
    }

    @ConfigItem(name="Fill compost bin", description="Do you want to fill the compost bin?", keyName="morytania.bins", section="morytania", position=6)
    default public boolean morytaniaCompostBin() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="falador.enabled", section="falador", position=1)
    default public boolean falador() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Herb patch", description="What do you want to plant in the herb patch", keyName="falador.herb", section="falador", position=2)
    default public at faladorHerbPatch() {
        return at.DEFAULT;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="trollheim.enabled", section="trollheim", position=1)
    default public boolean trollheim() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Fill compost bin", description="Do you want to fill the compost bin?", keyName="ardougne.bins", section="ardougne", position=6)
    default public boolean ardougneCompostBin() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Compost", description="Select the compost you want to use", keyName="compostType", section="General", position=5)
    default public H compostType() {
        return H.COMPOST;
    }

    @ConfigItem(name="Herb patch", description="What do you want to plant in the herb patch", keyName="farming_guild.herb", section="farming_guild", position=2)
    default public at farmingGuildHerbPatch() {
        return at.DEFAULT;
    }

    @ConfigItem(name="Bush", description="What do you want to plant in the bush patch", keyName="farming_guild.bush", section="farming_guild", position=6)
    default public aq farmingGuildBush() {
        return aq.DEFAULT;
    }

    @ConfigItem(name="Birdhouse type", description="What birdhouse type do you want to use", keyName="birdhouses.birdhouse", section="birdhouses", position=2)
    default public C birdhouse_type() {
        return C.REDWOOD;
    }

    @ConfigItem(name="Allotment (south)", description="What do you want to plant in the south allotment patch", keyName="ardougne.allotment.south", section="ardougne", position=5)
    default public ap ardougneSouthAllotment() {
        return ap.DEFAULT;
    }

    static {
        BIRDHOUSES = "birdhouses";
        MONASTERY = "monastery";
        FARMING_LOCATION_BINS = "bins";
        PREFER_SOONEST = "preferSoonest";
        FARM_TICK_OFFSET_PRECISION = "farmTickOffsetPrecision";
        BIRD_HOUSE = "birdhouse";
        GENERAL = "General";
        WEISS = "weiss";
        FARMING_LOCATION_ALLOTMENT_SOUTH = "allotment.south";
        FARMING_LOCATION_HERB = "herb";
        FARMING_LOCATION_BIRDHOUSE = "birdhouse";
        TIMERS = "timers";
        TROLLHEIM = "trollheim";
        FARMING_LOCATION_BUSH = "bush";
        DEFAULT = "defaults";
        BIRDHOUSE_NOTIFY = "birdHouseNotification";
        FOSSIL_ISLAND_UNDERWATER = "fossil_island_underwater";
        PROTECTED = "protected";
        COMPOST = "compost";
        GRAPE_VINE_KOUREND = "grape_vine_kourend";
        HOSIDIUS = "hosidius";
        NOTIFY = "notify";
        FARMING_LOCATION_FLOWER = "flower";
        STOPWATCHES = "stopwatches";
        MORYTANIA = "morytania";
        FARMING_GUILD = "farming_guild";
        FARMING_LOCATION_ENABLED = "enabled";
        FARMING_LOCATION_GRAPES = "grapes";
        FARMING_LOCATION_ALLOTMENT_NORTH = "allotment.north";
        CATHERBY = "catherby";
        BOTANIST = "botanist";
        FALADOR = "falador";
        ARDOUGNE = "ardougne";
        CHAMPIONS_GUILD = "champions_guild";
        AUTOWEED = "autoweed";
        FARM_TICK_OFFSET = "farmTickOffset";
        HARMONY = "harmony";
        FARMING_LOCATION_SEAWEED = "seaweed";
        TIME_CONFIG_GROUP = "timetracking";
        CONFIG_GROUP = "squirefarmer";
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="farming_guild.enabled", section="farming_guild", position=1)
    default public boolean farmingGuild() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Herb patch", description="What do you want to plant in the herb patch", keyName="trollheim.herb", section="trollheim", position=2)
    default public at trollheimHerbPatch() {
        return at.DEFAULT;
    }

    @ConfigItem(name="Allotment (north)", description="What do you want to plant in the flower patch", keyName="farming_guild.allotment.north", section="farming_guild", position=4)
    default public ap farmingGuildNorthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Apply compost potion", description="Do you want to apply compost potion to make supercompost?", keyName="compostPotion", section="General", position=3)
    default public boolean applyCompostPotion() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Herb patch", description="What do you want to plant in the herb patch", keyName="morytania.herb", section="morytania", position=2)
    default public at morytaniaHerbPatch() {
        return at.DEFAULT;
    }

    @ConfigItem(name="Herb patch", description="What do you want to plant in the herb patch", keyName="harmony.herb", section="harmony", position=2)
    default public at harmonyHerbPatch() {
        return at.DEFAULT;
    }

    @ConfigItem(name="Flower patch", description="What do you want to plant in the flower patch", keyName="farming_guild.flower", section="farming_guild", position=3)
    default public ar farmingGuildFlowerPatch() {
        return ar.DEFAULT;
    }

    @ConfigItem(name="Allotment (south)", description="What do you want to plant in the south allotment patch", keyName="falador.allotment.south", section="falador", position=5)
    default public ap faladorSouthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Herb patch", description="What do you want to plant in the herb patch", keyName="catherby.herb", section="catherby", position=2)
    default public at catherbyHerbPatch() {
        return at.DEFAULT;
    }

    @ConfigItem(name="Flower patch", description="What do you want to plant in the flower patch", keyName="grape_vine_kourend.flower", section="grape_vine_kourend", position=3, hidden=true)
    default public ar grapeVinesFlowerPatch() {
        return ar.DEFAULT;
    }

    @ConfigItem(name="Bush", description="Select the default bush you want to plant", keyName="defaults.bush", section="defaults", position=4)
    default public aq defaultBush() {
        return aq.WHITE_BERRY;
    }

    @ConfigItem(name="Allotment (south)", description="What do you want to plant in the south allotment patch", keyName="harmony.allotment.south", section="harmony", position=5, hidden=true)
    default public ap harmonySouthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Ignore stored timers", description="Do you want the plugin to go do a birdhouse run even if the stored timers indicate they aren't ready?", keyName="birdhouses.ignore_stored_timers", section="birdhouses", position=3)
    default public boolean birdhouses_ignoreTimers() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="birdhouses.enabled", section="birdhouses", position=1)
    default public boolean birdhouses_enabled() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="weiss.enabled", section="weiss", position=1)
    default public boolean weiss() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Fill compost bin", description="Do you want to fill the compost bin?", keyName="falador.bins", section="falador", position=6)
    default public boolean faladorCompostBin() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Allotment (north)", description="What do you want to plant in the north allotment patch", keyName="trollheim.allotment.north", section="trollheim", position=4, hidden=true)
    default public ap trollheimNorthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Allotment (south)", description="What do you want to plant in the south allotment patch", keyName="morytania.allotment.south", section="morytania", position=5)
    default public ap morytaniaSouthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Fill compost bin", description="Do you want to fill the compost bin?", keyName="trollheim.bins", section="trollheim", position=6, hidden=true)
    default public boolean trollheimCompostBin() {
        return ((0xD0 ^ 0x83) & ~(0x55 ^ 6)) != 0;
    }

    @ConfigItem(name="Allotment (north)", description="What do you want to plant in the north allotment patch", keyName="ardougne.allotment.north", section="ardougne", position=4)
    default public ap ardougneNorthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Allotment (south)", description="What do you want to plant in the south allotment patch", keyName="hosidius.allotment.south", section="hosidius", position=5)
    default public ap hosidiusSouthAllotment() {
        return ap.DEFAULT;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="grape_vine_kourend.enabled", section="grape_vine_kourend", position=1)
    default public boolean grapeVines() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="champions_guild.enabled", section="champions_guild", position=1)
    default public boolean champions_guild() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="monastery.enabled", section="monastery", position=1)
    default public boolean monastery() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Herb patch", description="What do you want to plant in the herb patch", keyName="hosidius.herb", section="hosidius", position=2)
    default public at hosidiusHerbPatch() {
        return at.DEFAULT;
    }

    @ConfigItem(name="Herb patch", description="What do you want to plant in the herb patch", keyName="weiss.herb", section="weiss", position=2)
    default public at weissHerbPatch() {
        return at.DEFAULT;
    }

    @ConfigItem(name="Fill compost bin", description="Do you want to fill the compost bin?", keyName="farming_guild.bins", section="farming_guild", position=7)
    default public boolean farmingGuildCompostBin() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Log out and wait", description="Do you want to log out and wait after the run is done (stops otherwise)?", keyName="log", section="General", position=7)
    default public boolean log() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Enabled", description="Do you want this location enabled?", keyName="morytania.enabled", section="morytania", position=1)
    default public boolean morytania() {
        return " ".length() != 0;
    }
}

