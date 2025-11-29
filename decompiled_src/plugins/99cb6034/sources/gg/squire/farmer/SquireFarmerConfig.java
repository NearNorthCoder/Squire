package gg.squire.farmer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.C;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.EnumC0016ap;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.EnumC0017aq;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.EnumC0018ar;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.EnumC0019as;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.EnumC0020at;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.EnumC0024ax;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.H;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.J;
@ConfigGroup("squirefarmer")
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:gg/squire/farmer/SquireFarmerConfig.class */
public interface SquireFarmerConfig extends Config {
    @ConfigSection(name = "Birdhouses", description = "Birdhouse settings", position = 15, keyName = "birdhouses")
    public static final /* synthetic */ String BIRDHOUSES = "birdhouses";
    @ConfigSection(name = "Monastery", description = "Monastery settings", position = 12, keyName = "monastery")
    public static final /* synthetic */ String MONASTERY = "monastery";
    public static final /* synthetic */ String FARMING_LOCATION_BINS = "bins";
    public static final /* synthetic */ String PREFER_SOONEST = "preferSoonest";
    public static final /* synthetic */ String FARM_TICK_OFFSET_PRECISION = "farmTickOffsetPrecision";
    public static final /* synthetic */ String BIRD_HOUSE = "birdhouse";
    @ConfigSection(name = "General", description = "General settings", position = 0, keyName = "generalSection")
    public static final /* synthetic */ String GENERAL = "General";
    @ConfigSection(name = "Weiss", description = "Weiss settings", position = 9, keyName = "weiss")
    public static final /* synthetic */ String WEISS = "weiss";
    public static final /* synthetic */ String FARMING_LOCATION_ALLOTMENT_SOUTH = "allotment.south";
    public static final /* synthetic */ String FARMING_LOCATION_HERB = "herb";
    public static final /* synthetic */ String FARMING_LOCATION_BIRDHOUSE = "birdhouse";
    public static final /* synthetic */ String TIMERS = "timers";
    @ConfigSection(name = "Trollheim", description = "Trollheim settings", position = 10, keyName = "trollheim")
    public static final /* synthetic */ String TROLLHEIM = "trollheim";
    public static final /* synthetic */ String FARMING_LOCATION_BUSH = "bush";
    @ConfigSection(name = "Default", description = "Default Seeds", position = 1, keyName = "default")
    public static final /* synthetic */ String DEFAULT = "defaults";
    public static final /* synthetic */ String BIRDHOUSE_NOTIFY = "birdHouseNotification";
    @ConfigSection(name = "Fossil Island Underwater", description = "Fossil Island Underwater settings", position = 14, keyName = "fossil_island_underwater")
    public static final /* synthetic */ String FOSSIL_ISLAND_UNDERWATER = "fossil_island_underwater";
    public static final /* synthetic */ String PROTECTED = "protected";
    public static final /* synthetic */ String COMPOST = "compost";
    @ConfigSection(name = "Grapes", description = "Grapevine settings (in kourend)", position = 11, keyName = "grape_vine_kourend")
    public static final /* synthetic */ String GRAPE_VINE_KOUREND = "grape_vine_kourend";
    @ConfigSection(name = "Hosidius", description = "Hosidius settings", position = 4, keyName = "hosidius")
    public static final /* synthetic */ String HOSIDIUS = "hosidius";
    public static final /* synthetic */ String NOTIFY = "notify";
    public static final /* synthetic */ String FARMING_LOCATION_FLOWER = "flower";
    public static final /* synthetic */ String STOPWATCHES = "stopwatches";
    @ConfigSection(name = "Morytania", description = "Morytania settings", position = 5, keyName = "morytania")
    public static final /* synthetic */ String MORYTANIA = "morytania";
    @ConfigSection(name = "Farming Guild", description = "Farming Guild settings", position = 2, keyName = "farmingGuild")
    public static final /* synthetic */ String FARMING_GUILD = "farming_guild";
    public static final /* synthetic */ String FARMING_LOCATION_ENABLED = "enabled";
    public static final /* synthetic */ String FARMING_LOCATION_GRAPES = "grapes";
    public static final /* synthetic */ String FARMING_LOCATION_ALLOTMENT_NORTH = "allotment.north";
    @ConfigSection(name = "Catherby", description = "Catherby settings", position = 3, keyName = "catherby")
    public static final /* synthetic */ String CATHERBY = "catherby";
    public static final /* synthetic */ String BOTANIST = "botanist";
    @ConfigSection(name = "Falador", description = "Falador settings", position = 6, keyName = "falador")
    public static final /* synthetic */ String FALADOR = "falador";
    @ConfigSection(name = "Ardougne", description = "Ardougne settings", position = 7, keyName = "ardougne")
    public static final /* synthetic */ String ARDOUGNE = "ardougne";
    @ConfigSection(name = "Champions Guild", description = "Champions Guild settings", position = 13, keyName = "champions_guild")
    public static final /* synthetic */ String CHAMPIONS_GUILD = "champions_guild";
    public static final /* synthetic */ String AUTOWEED = "autoweed";
    public static final /* synthetic */ String FARM_TICK_OFFSET = "farmTickOffset";
    @ConfigSection(name = "Harmony", description = "Harmony settings", position = 8, keyName = "harmony")
    public static final /* synthetic */ String HARMONY = "harmony";
    public static final /* synthetic */ String FARMING_LOCATION_SEAWEED = "seaweed";
    public static final /* synthetic */ String TIME_CONFIG_GROUP = "timetracking";
    public static final /* synthetic */ String CONFIG_GROUP = "squirefarmer";

    @ConfigItem(name = "Flower patch", description = "What do you want to plant in the flower patch", keyName = "trollheim.flower", section = "trollheim", position = 3, hidden = true)
    default EnumC0018ar trollheimFlowerPatch() {
        return EnumC0018ar.DEFAULT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(name = "Fill compost bin", description = "Do you want to fill the compost bin?", keyName = "harmony.bins", section = "harmony", position = 6, hidden = true)
    default boolean harmonyCompostBin() {
        return ((6 ^ 94) ^ (191 ^ 161)) & (((((52 + 8) - (-64)) + 8) ^ (((141 + 128) - 262) + 187)) ^ (-" ".length()));
    }

    @ConfigItem(name = "Allotment (north)", description = "What do you want to plant in the north allotment patch", keyName = "grape_vine_kourend.allotment.north", section = "grape_vine_kourend", position = 4, hidden = true)
    default EnumC0016ap grapeVinesNorthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Bank Loadout", description = "What bank loadout to withdraw at the start of a run?", keyName = "bank.loadout", section = "General", position = 0)
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "fossil_island_underwater.enabled", section = "fossil_island_underwater", position = 1)
    default boolean fossil_island_underwater() {
        return " ".length();
    }

    @ConfigItem(name = "Flower", description = "Select the default flower you want to plant", keyName = "defaults.flower", section = "defaults", position = 2)
    default EnumC0018ar defaultFlower() {
        return EnumC0018ar.LIMPWURT;
    }

    @ConfigItem(name = "Compost items", description = "Select the produce you want to use for making compost", keyName = "compostProduce", section = "General", position = 2)
    default J compostProduce() {
        return J.WATERMELON;
    }

    @ConfigItem(name = "Herb patch", description = "What do you want to plant in the herb patch", keyName = "grape_vine_kourend.herb", section = "grape_vine_kourend", position = 2, hidden = true)
    default EnumC0020at grapeVinesHerbPatch() {
        return EnumC0020at.DEFAULT;
    }

    @ConfigItem(name = "Flower patch", description = "What do you want to plant in the flower patch", keyName = "weiss.flower", section = "weiss", position = 3, hidden = true)
    default EnumC0018ar weissFlowerPatch() {
        return EnumC0018ar.DEFAULT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(name = "Fill compost bin", description = "Do you want to fill the compost bin?", keyName = "weiss.bins", section = "weiss", position = 6, hidden = true)
    default boolean weissCompostBin() {
        return ((((182 + 230) - 253) + 95) ^ (((43 + 74) - 2) + 82)) & (((28 ^ 117) ^ (194 ^ 144)) ^ (-" ".length()));
    }

    @ConfigItem(name = "Allotment (south)", description = "What do you want to plant in the south allotment patch", keyName = "weiss.allotment.south", section = "weiss", position = 5, hidden = true)
    default EnumC0016ap weissSouthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Grape patch", description = "What do you want to plant in the grape patch", keyName = "grape_vine_kourend.grapes", section = "grape_vine_kourend", position = 2, hidden = true)
    default EnumC0019as grapeVinesGrapeType() {
        return EnumC0019as.GRAPES;
    }

    @ConfigItem(name = "Flower patch", description = "What do you want to plant in the flower patch", keyName = "falador.flower", section = "falador", position = 3)
    default EnumC0018ar faladorFlowerPatch() {
        return EnumC0018ar.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "ardougne.enabled", section = "ardougne", position = 1)
    default boolean ardougne() {
        return " ".length();
    }

    @ConfigItem(name = "Allotment (north)", description = "What do you want to plant in the north allotment patch", keyName = "weiss.allotment.north", section = "weiss", position = 4, hidden = true)
    default EnumC0016ap weissNorthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Allotment (north)", description = "What do you want to plant in the north allotment patch", keyName = "harmony.allotment.north", section = "harmony", position = 4)
    default EnumC0016ap harmonyNorthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Fill compost bin", description = "Do you want to fill the compost bin?", keyName = "catherby.bins", section = "catherby", position = 6)
    default boolean catherbyCompostBin() {
        return " ".length();
    }

    @ConfigItem(name = "Allotment", description = "Select the default allotment you want to plant", keyName = "defaults.allotment.north", section = "defaults", position = 3)
    default EnumC0016ap defaultAllotment() {
        return EnumC0016ap.WATERMELON;
    }

    @ConfigItem(name = "Allotment (south)", description = "What do you want to plant in the south allotment patch", keyName = "grape_vine_kourend.allotment.south", section = "grape_vine_kourend", position = 5, hidden = true)
    default EnumC0016ap grapeVinesSouthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Allotment (north)", description = "What do you want to plant in the north allotment patch", keyName = "hosidius.allotment.north", section = "hosidius", position = 4)
    default EnumC0016ap hosidiusNorthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Allotment (south)", description = "What do you want to plant in the flower patch", keyName = "farming_guild.allotment.south", section = "farming_guild", position = 5)
    default EnumC0016ap farmingGuildSouthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Flower patch", description = "What do you want to plant in the flower patch", keyName = "harmony.flower", section = "harmony", position = 3, hidden = true)
    default EnumC0018ar harmonyFlowerPatch() {
        return EnumC0018ar.DEFAULT;
    }

    @ConfigItem(name = "Flower patch", description = "What do you want to plant in the flower patch", keyName = "hosidius.flower", section = "hosidius", position = 3)
    default EnumC0018ar hosidiusFlowerPatch() {
        return EnumC0018ar.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Apply volcanic ash", description = "Do you want to use volcanic ash to make ultra compost?", keyName = "volcanicAsh", section = "General", position = 4)
    default boolean applyVolcanicAsh() {
        return " ".length();
    }

    @ConfigItem(name = "Allotment (north)", description = "What do you want to plant in the north allotment patch", keyName = "catherby.allotment.north", section = "catherby", position = 4)
    default EnumC0016ap catherbyNorthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Flower patch", description = "What do you want to plant in the flower patch", keyName = "ardougne.flower", section = "ardougne", position = 3)
    default EnumC0018ar ardougneFlowerPatch() {
        return EnumC0018ar.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Bottomless bucket", description = "Do you want to use a bottomless bucket?", keyName = "bottomless", section = "General", position = 1)
    default boolean bottomless() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled", keyName = "catherby.enabled", section = "catherby", position = 1)
    default boolean catherby() {
        return " ".length();
    }

    @ConfigItem(name = "Allotment (north)", description = "What do you want to plant in the north allotment patch", keyName = "falador.allotment.north", section = "falador", position = 4)
    default EnumC0016ap faladorNorthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Fill compost bin", description = "Do you want to fill the compost bin?", keyName = "hosidius.bins", section = "hosidius", position = 6)
    default boolean hosidiusCompostBin() {
        return " ".length();
    }

    @ConfigItem(name = "Allotment (south)", description = "What do you want to plant in the south allotment patch", keyName = "catherby.allotment.south", section = "catherby", position = 5)
    default EnumC0016ap catherbySouthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "harmony.enabled", section = "harmony", position = 1)
    default boolean harmony() {
        return " ".length();
    }

    @ConfigItem(name = "Bush patch", description = "What do you want to plant in the bush patch", keyName = "champions_guild.bush", section = "champions_guild", position = 2)
    default EnumC0017aq champions_guildBushPatch() {
        return EnumC0017aq.DEFAULT;
    }

    @ConfigItem(name = "Compost (flowers)", description = "Select the compost you want to use for flower patches", keyName = "compostTypeFlowers", section = "General", position = 6)
    default H compostTypeFlowers() {
        return H.COMPOST;
    }

    @ConfigItem(name = "Allotment (south)", description = "What do you want to plant in the south allotment patch", keyName = "trollheim.allotment.south", section = "trollheim", position = 5, hidden = true)
    default EnumC0016ap trollheimSouthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Seaweed patch", description = "What do you want to plant in the seaweed patch", keyName = "fossil_island_underwater.seaweed", section = "fossil_island_underwater", position = 2)
    default EnumC0024ax fossil_island_underwaterSeaweedPatch() {
        return EnumC0024ax.GIANT_SEAWEED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(name = "Fill compost bin", description = "Do you want to fill the compost bin?", keyName = "grape_vine_kourend.bins", section = "grape_vine_kourend", position = 6, hidden = true)
    default boolean grapeVinesCB() {
        return "  ".length() & ("  ".length() ^ (-" ".length()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Pick-up spores", description = "Do you want to pick up spores that spawn?", keyName = "fossil_island_underwater.spores", section = "fossil_island_underwater", position = 1)
    default boolean fossil_island_underwaterSpores() {
        return " ".length();
    }

    @ConfigItem(name = "Herb", description = "Select the default herb you want to plant", keyName = "defaults.herb", section = "defaults", position = 1)
    default EnumC0020at defaultHerb() {
        return EnumC0020at.RANARR;
    }

    @ConfigItem(name = "Flower patch", description = "What do you want to plant in the flower patch", keyName = "morytania.flower", section = "morytania", position = 3)
    default EnumC0018ar morytaniaFlowerPatch() {
        return EnumC0018ar.DEFAULT;
    }

    @ConfigItem(name = "Allotment (north)", description = "What do you want to plant in the north allotment patch", keyName = "morytania.allotment.north", section = "morytania", position = 4)
    default EnumC0016ap morytaniaNorthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Flower patch", description = "What do you want to plant in the flower patch", keyName = "catherby.flower", section = "catherby", position = 3)
    default EnumC0018ar catherbyFlowerPatch() {
        return EnumC0018ar.DEFAULT;
    }

    @ConfigItem(name = "Herb patch", description = "What do you want to plant in the herb patch", keyName = "ardougne.herb", section = "ardougne", position = 2)
    default EnumC0020at ardougneHerbPatch() {
        return EnumC0020at.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "hosidius.enabled", section = "hosidius", position = 1)
    default boolean hosidius() {
        return " ".length();
    }

    @ConfigItem(name = "Bush patch", description = "What do you want to plant in the bush patch", keyName = "monastery.bush", section = "monastery", position = 2)
    default EnumC0017aq monasteryBushPatch() {
        return EnumC0017aq.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Fill compost bin", description = "Do you want to fill the compost bin?", keyName = "morytania.bins", section = "morytania", position = 6)
    default boolean morytaniaCompostBin() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "falador.enabled", section = "falador", position = 1)
    default boolean falador() {
        return " ".length();
    }

    @ConfigItem(name = "Herb patch", description = "What do you want to plant in the herb patch", keyName = "falador.herb", section = "falador", position = 2)
    default EnumC0020at faladorHerbPatch() {
        return EnumC0020at.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "trollheim.enabled", section = "trollheim", position = 1)
    default boolean trollheim() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Fill compost bin", description = "Do you want to fill the compost bin?", keyName = "ardougne.bins", section = "ardougne", position = 6)
    default boolean ardougneCompostBin() {
        return " ".length();
    }

    @ConfigItem(name = "Compost", description = "Select the compost you want to use", keyName = "compostType", section = "General", position = 5)
    default H compostType() {
        return H.COMPOST;
    }

    @ConfigItem(name = "Herb patch", description = "What do you want to plant in the herb patch", keyName = "farming_guild.herb", section = "farming_guild", position = 2)
    default EnumC0020at farmingGuildHerbPatch() {
        return EnumC0020at.DEFAULT;
    }

    @ConfigItem(name = "Bush", description = "What do you want to plant in the bush patch", keyName = "farming_guild.bush", section = "farming_guild", position = 6)
    default EnumC0017aq farmingGuildBush() {
        return EnumC0017aq.DEFAULT;
    }

    @ConfigItem(name = "Birdhouse type", description = "What birdhouse type do you want to use", keyName = "birdhouses.birdhouse", section = "birdhouses", position = 2)
    default C birdhouse_type() {
        return C.REDWOOD;
    }

    @ConfigItem(name = "Allotment (south)", description = "What do you want to plant in the south allotment patch", keyName = "ardougne.allotment.south", section = "ardougne", position = 5)
    default EnumC0016ap ardougneSouthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "farming_guild.enabled", section = "farming_guild", position = 1)
    default boolean farmingGuild() {
        return " ".length();
    }

    @ConfigItem(name = "Herb patch", description = "What do you want to plant in the herb patch", keyName = "trollheim.herb", section = "trollheim", position = 2)
    default EnumC0020at trollheimHerbPatch() {
        return EnumC0020at.DEFAULT;
    }

    @ConfigItem(name = "Allotment (north)", description = "What do you want to plant in the flower patch", keyName = "farming_guild.allotment.north", section = "farming_guild", position = 4)
    default EnumC0016ap farmingGuildNorthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Apply compost potion", description = "Do you want to apply compost potion to make supercompost?", keyName = "compostPotion", section = "General", position = 3)
    default boolean applyCompostPotion() {
        return " ".length();
    }

    @ConfigItem(name = "Herb patch", description = "What do you want to plant in the herb patch", keyName = "morytania.herb", section = "morytania", position = 2)
    default EnumC0020at morytaniaHerbPatch() {
        return EnumC0020at.DEFAULT;
    }

    @ConfigItem(name = "Herb patch", description = "What do you want to plant in the herb patch", keyName = "harmony.herb", section = "harmony", position = 2)
    default EnumC0020at harmonyHerbPatch() {
        return EnumC0020at.DEFAULT;
    }

    @ConfigItem(name = "Flower patch", description = "What do you want to plant in the flower patch", keyName = "farming_guild.flower", section = "farming_guild", position = 3)
    default EnumC0018ar farmingGuildFlowerPatch() {
        return EnumC0018ar.DEFAULT;
    }

    @ConfigItem(name = "Allotment (south)", description = "What do you want to plant in the south allotment patch", keyName = "falador.allotment.south", section = "falador", position = 5)
    default EnumC0016ap faladorSouthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Herb patch", description = "What do you want to plant in the herb patch", keyName = "catherby.herb", section = "catherby", position = 2)
    default EnumC0020at catherbyHerbPatch() {
        return EnumC0020at.DEFAULT;
    }

    @ConfigItem(name = "Flower patch", description = "What do you want to plant in the flower patch", keyName = "grape_vine_kourend.flower", section = "grape_vine_kourend", position = 3, hidden = true)
    default EnumC0018ar grapeVinesFlowerPatch() {
        return EnumC0018ar.DEFAULT;
    }

    @ConfigItem(name = "Bush", description = "Select the default bush you want to plant", keyName = "defaults.bush", section = "defaults", position = 4)
    default EnumC0017aq defaultBush() {
        return EnumC0017aq.WHITE_BERRY;
    }

    @ConfigItem(name = "Allotment (south)", description = "What do you want to plant in the south allotment patch", keyName = "harmony.allotment.south", section = "harmony", position = 5, hidden = true)
    default EnumC0016ap harmonySouthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Ignore stored timers", description = "Do you want the plugin to go do a birdhouse run even if the stored timers indicate they aren't ready?", keyName = "birdhouses.ignore_stored_timers", section = "birdhouses", position = 3)
    default boolean birdhouses_ignoreTimers() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "birdhouses.enabled", section = "birdhouses", position = 1)
    default boolean birdhouses_enabled() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "weiss.enabled", section = "weiss", position = 1)
    default boolean weiss() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Fill compost bin", description = "Do you want to fill the compost bin?", keyName = "falador.bins", section = "falador", position = 6)
    default boolean faladorCompostBin() {
        return " ".length();
    }

    @ConfigItem(name = "Allotment (north)", description = "What do you want to plant in the north allotment patch", keyName = "trollheim.allotment.north", section = "trollheim", position = 4, hidden = true)
    default EnumC0016ap trollheimNorthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Allotment (south)", description = "What do you want to plant in the south allotment patch", keyName = "morytania.allotment.south", section = "morytania", position = 5)
    default EnumC0016ap morytaniaSouthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Fill compost bin", description = "Do you want to fill the compost bin?", keyName = "trollheim.bins", section = "trollheim", position = 6, hidden = true)
    default boolean trollheimCompostBin() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(name = "Allotment (north)", description = "What do you want to plant in the north allotment patch", keyName = "ardougne.allotment.north", section = "ardougne", position = 4)
    default EnumC0016ap ardougneNorthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    @ConfigItem(name = "Allotment (south)", description = "What do you want to plant in the south allotment patch", keyName = "hosidius.allotment.south", section = "hosidius", position = 5)
    default EnumC0016ap hosidiusSouthAllotment() {
        return EnumC0016ap.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "grape_vine_kourend.enabled", section = "grape_vine_kourend", position = 1)
    default boolean grapeVines() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "champions_guild.enabled", section = "champions_guild", position = 1)
    default boolean champions_guild() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "monastery.enabled", section = "monastery", position = 1)
    default boolean monastery() {
        return " ".length();
    }

    @ConfigItem(name = "Herb patch", description = "What do you want to plant in the herb patch", keyName = "hosidius.herb", section = "hosidius", position = 2)
    default EnumC0020at hosidiusHerbPatch() {
        return EnumC0020at.DEFAULT;
    }

    @ConfigItem(name = "Herb patch", description = "What do you want to plant in the herb patch", keyName = "weiss.herb", section = "weiss", position = 2)
    default EnumC0020at weissHerbPatch() {
        return EnumC0020at.DEFAULT;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Fill compost bin", description = "Do you want to fill the compost bin?", keyName = "farming_guild.bins", section = "farming_guild", position = 7)
    default boolean farmingGuildCompostBin() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Log out and wait", description = "Do you want to log out and wait after the run is done (stops otherwise)?", keyName = "log", section = "General", position = 7)
    default boolean log() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(name = "Enabled", description = "Do you want this location enabled?", keyName = "morytania.enabled", section = "morytania", position = 1)
    default boolean morytania() {
        return " ".length();
    }
}
