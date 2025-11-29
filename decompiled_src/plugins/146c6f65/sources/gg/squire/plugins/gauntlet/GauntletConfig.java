package gg.squire.plugins.gauntlet;

import java.util.stream.Stream;
import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squiregauntlet")
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:gg/squire/plugins/gauntlet/GauntletConfig.class */
public interface GauntletConfig extends Config {
    @ConfigSection(name = "Chatting", description = "Chat related settings", position = 30)
    public static final /* synthetic */ String chatSection = "Chat Options";
    @ConfigSection(name = "Debug", description = "Debug overlays", position = 40)
    public static final /* synthetic */ String debugSection = "Debug";
    @ConfigSection(name = "Exploration", description = "Settings related to exploration", position = 10)
    public static final /* synthetic */ String resourceSection = "Resources";
    @ConfigSection(name = "Boss", description = "Boss related settings", position = 20)
    public static final /* synthetic */ String bossSection = "Hunllef Fight";
    @ConfigSection(name = "Gauntlet Lobby", description = "Settings related to the lobby", position = 0)
    public static final /* synthetic */ String entrySection = "Gauntlet Entrance";

    @ConfigItem(position = 32, keyName = "chatAfterKill", name = "Responses to kc", description = "Messages to send after every x kc", section = "Chat Options", hidden = true)
    default String messagesAfterKill() {
        return "5:cba anymore;fuck gauntlet;ugh";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 29, keyName = "safeBossFight", name = "Focus on safety over speed", description = "Increases tornado dodge range and disables melee during tornadoes for extra safety", section = "Hunllef Fight")
    default boolean safeBossFight() {
        return ((((125 + 51) - 88) + 55) ^ (((169 + 174) - 309) + 148)) & (((66 ^ 125) ^ (113 ^ 119)) ^ (-" ".length()));
    }

    @ConfigItem(position = 44, keyName = "onlyHandlePrayers", name = "Only handle prayers", description = "Doesn't do anything but handle prayers", section = "Debug")
    default boolean onlyHandlePrayers() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 13, keyName = "potionGoal", name = "Amount of potions", description = "The number of potions you want to make for the Hunleff fight", section = "Resources")
    default int potionGoal() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 16, keyName = "t3Home", name = "Go home for t3 staff", description = "Goes home after getting t3 staff to make it and save some time for killing extra t1/t2/t3.", section = "Resources", hidden = true, unhide = "t3Offhand", unhideValue = "true", disabledBy = "t2Offhand", disabledByValue = "true")
    default boolean goHomeT3() {
        return ((((149 + 20) - 163) + 243) ^ (((38 + 131) - 128) + 129)) & (((((189 + 135) - 287) + 201) ^ (((80 + 4) - (-30)) + 75)) ^ (-" ".length()));
    }

    @ConfigItem(position = 11, keyName = "fishGoal", name = "Amount of fish", description = "The number of fish you want to have for the Hunleff fight", section = "Resources")
    default int fishGoal() {
        return (47 ^ 77) ^ (168 ^ 198);
    }

    @ConfigItem(position = 42, keyName = "showDebugExtra", name = "Adds extra info to box", description = "Adds required items and required crafting to infobox", section = "Debug")
    default boolean showDebugInfoboxAll() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 43, keyName = "showDebugOverlay", name = "Display Map Overlay", description = "Displays debug overlay", section = "Debug")
    default boolean showDebugOverlay() {
        return ((105 ^ 114) ^ (60 ^ 27)) & (((212 ^ 170) ^ (238 ^ 172)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 31, keyName = "chattingEnabled", name = "Enable chatting", description = "Enables chatting using the following messages", section = "Chat Options")
    default boolean enableChatting() {
        return ((62 ^ 110) ^ (8 ^ 66)) & (((60 ^ 70) ^ (214 ^ 182)) ^ (-" ".length()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 27, keyName = "redemptionFlick", name = "Flick redemption prayer", description = "Uses redemption to heal up if it's possible and/or necessary", section = "Hunllef Fight")
    default boolean flickRedemption() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 1, keyName = "corruptedMode", name = "Corrupted gauntlet mode", description = "Enters the corrupted version of the gauntlet", section = "Gauntlet Entrance")
    default boolean corruptedMode() {
        return ((200 ^ 129) ^ (146 ^ 130)) & (((102 ^ 27) ^ (142 ^ 170)) ^ (-" ".length()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 28, keyName = "1tFlickBoss", name = "1T Flick boss fight", description = "Uses no prayer points in the boss fight through 1t flicking", section = "Hunllef Fight")
    default boolean flickBossFight() {
        return " ".length();
    }

    @ConfigItem(position = 25, keyName = "eatBelowNonados", name = "Idle hitpoints to eat below", description = "HP to eat at (not running from tornadoes)", section = "Hunllef Fight")
    @Range(max = 79)
    default int eatBelowNoNados() {
        return (91 ^ 95) ^ (44 ^ 62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 14, keyName = "t2Offhand", name = "Make your offhand weapon t2", description = "Looks for more crystals to make the offhand weapon T2 (bow/staff depending on cycle)", section = "Resources", disabledBy = "t3Offhand", disabledByValue = "true")
    default boolean makeT2Offhand() {
        return ((8 ^ 93) ^ (29 ^ 93)) & (((148 ^ 169) ^ (52 ^ 28)) ^ (-" ".length()));
    }

    @ConfigItem(position = 12, keyName = "fishGoalMin", name = "Fish goal deviation", description = "Should we enter the boss fight when we are missing the fish goal by this amount?", section = "Resources")
    @Range(max = 5)
    default int fishGoalDeviation() {
        return " ".length();
    }

    @ConfigItem(position = 5, keyName = "stopAtKc", name = "Stop after x kills", description = "Stops this plugin after it has reached the specified amount of kills (0 = disabled)", section = "Gauntlet Entrance")
    @Range(max = 25)
    default int stopAtKc() {
        return ("  ".length() ^ (81 ^ 69)) & (((64 ^ 115) ^ (84 ^ 113)) ^ (-" ".length()));
    }

    @ConfigItem(position = 15, keyName = "t3Offhand", name = "Use two t3 weapons", description = "Tries to kill two demi-bosses for two t3 weapons instead of doing 5:1, can be slower but more consistent.", section = "Resources", disabledBy = "t2Offhand", disabledByValue = "true")
    default boolean makeT3Offhand() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 3, keyName = "alching", name = "Items to alch", description = "High alch these items when you loot", section = "Gauntlet Entrance")
    default String alching() {
        Integer[] numArr = new Integer[(8 ^ 100) ^ (89 ^ 34)];
        numArr[((((42 + 112) - 18) + 6) ^ (((127 + 36) - 64) + 68)) & (((((70 + 13) - 81) + 151) ^ (((117 + 79) - 46) + 26)) ^ (-" ".length())) & ((((160 ^ 194) ^ (13 ^ 40)) & (((46 ^ 13) ^ (225 ^ 133)) ^ (-" ".length()))) ^ (-" ".length()))] = Integer.valueOf((-((-537) & 13145)) & (-16389) & 30207);
        numArr[" ".length()] = Integer.valueOf((-10277) & 11437);
        numArr["  ".length()] = Integer.valueOf((-((-1921) & 6122)) & (-8193) & 13823);
        numArr["   ".length()] = Integer.valueOf((-((-12549) & 31501)) & (-1) & 20223);
        numArr[(214 ^ 167) ^ (60 ^ 73)] = Integer.valueOf((-((-28007) & 32639)) & (-10501) & 16255);
        numArr[120 ^ 125] = Integer.valueOf((-6285) & 7357);
        numArr[177 ^ 183] = Integer.valueOf((-((-5571) & 32767)) & (-4097) & 32383);
        numArr[(((80 + 142) - 159) + 85) ^ (((75 + 113) - 114) + 73)] = Integer.valueOf((-((-9783) & 30455)) & (-10757) & 32759);
        numArr[(((123 + 136) - 223) + 121) ^ (((8 + 82) - 29) + 88)] = Integer.valueOf((-((-569) & 7739)) & (-16546) & 24567);
        numArr[(98 ^ 76) ^ (146 ^ 181)] = Integer.valueOf((-14466) & 15319);
        numArr[(68 ^ 32) ^ (213 ^ 187)] = Integer.valueOf((-((-17045) & 23549)) & (-8209) & 15871);
        numArr[74 ^ 65] = Integer.valueOf((-((-2387) & 22899)) & (-8715) & 30655);
        numArr[53 ^ 57] = Integer.valueOf((-6925) & 8045);
        numArr[(((110 + 85) - 180) + 155) ^ (((88 + 18) - 82) + 143)] = Integer.valueOf((-20737) & 21807);
        numArr[75 ^ 69] = Integer.valueOf((-((-4609) & 23489)) & (-513) & 20477);
        numArr[(247 ^ 132) ^ (68 ^ 56)] = Integer.valueOf((-17249) & 20453);
        numArr[(154 ^ 168) ^ (27 ^ 57)] = Integer.valueOf((-((-1797) & 18380)) & (-257) & 17919);
        numArr[(((145 + 107) - 226) + 182) ^ (((24 + 97) - 8) + 80)] = Integer.valueOf((-17218) & 18381);
        numArr[69 ^ 87] = Integer.valueOf((-20993) & 22268);
        numArr[(202 ^ 188) ^ (243 ^ 150)] = Integer.valueOf((-((-3377) & 12213)) & (-4385) & 14334);
        numArr[(32 ^ 126) ^ (106 ^ 32)] = Integer.valueOf((-12565) & 15767);
        numArr[8 ^ 29] = Integer.valueOf((-14777) & 15870);
        numArr[190 ^ 168] = Integer.valueOf((-((-3681) & 8163)) & (-18949) & 24558);
        return (String) Stream.of((Object[]) numArr).reduce("", str, num -> {
            return str + "," + num;
        }, (v0, v1) -> {
            return v0.concat(v1);
        });
    }

    @ConfigItem(position = 32, keyName = "chatAfterLoot", name = "Responses to my loot", description = "Messages to send after our loot, check discord for configuration", section = "Chat Options")
    default String messagesAfterLoot() {
        return "enhanced:finally!!!!!;omggggg yessssss :DDDD;easy money lol";
    }

    @ConfigItem(position = 26, keyName = "eatToDuringNados", name = "Hitpoints to eat until during danger", description = "Hitpoints to eat until during danger, such as running from tornadoes or tiles", section = "Hunllef Fight")
    @Range(max = 99)
    default int eatToDuringNados() {
        return (111 ^ 68) ^ (0 ^ 96);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 4, keyName = "deposit", name = "Deposit items at the box", description = "Deposit all items in the bank when your inventory is getting full", section = "Gauntlet Entrance")
    default boolean deposit() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 9, keyName = "hopUntilEmpty", name = "Hop until empty room", description = "Makes the plugin hop until an empty room for looting", section = "Gauntlet Entrance")
    default boolean hopUntilEmpty() {
        return " ".length();
    }

    @ConfigItem(position = 45, keyName = "pauseTasks", name = "Pause/Resume Execution", description = "Pauses/resumes all current tasks", section = "Debug")
    default Button pauseTasks() {
        return new Button();
    }

    @ConfigItem(position = 12, keyName = "fishGoalAbort", name = "Abort fish amount", description = "If we have less than or equal to this amount in (cooked) fish before starting the fight, we will abort and try again.", section = "Resources")
    @Range(max = 18)
    default int abortFishAmount() {
        return 51 ^ 59;
    }

    @ConfigItem(position = 17, keyName = "flickMonsters", name = "1t pray flick monsters", description = "Uses 1t pray flicking to save on prayer", section = "Resources")
    default boolean flickMonsters() {
        return (true ^ true) & (true ^ true);
    }

    @ConfigItem(position = 32, keyName = "chatAfterGlobal", name = "Responses to other loots", description = "Messages to send after world kills", section = "Chat Options")
    default String messagesAfterChat() {
        return "enhanced:gz lol;gz...;nice";
    }

    @ConfigItem(position = 16, keyName = "makeArmour", name = "Make t1 armour", description = "Gets the resources for t1 armour", section = "Resources")
    default boolean makeArmour() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 2, keyName = "dropping", name = "Items to drop", description = "Drop these items when you loot", section = "Gauntlet Entrance")
    default String dropping() {
        Integer[] numArr = new Integer[106 ^ 100];
        numArr[(115 ^ 60) & ((252 ^ 179) ^ (-1))] = Integer.valueOf((-8330) & 31999);
        numArr[" ".length()] = Integer.valueOf(((24 + 189) - 18) + 0);
        numArr["  ".length()] = Integer.valueOf((-((-2401) & 3433)) & (-29218) & 32767);
        numArr["   ".length()] = Integer.valueOf((-((-25097) & 30667)) & (-26625) & 32750);
        numArr[(95 ^ 112) ^ (167 ^ 140)] = Integer.valueOf((-((-815) & 24383)) & (-8193) & 32319);
        numArr[(((159 + 184) - 269) + 124) ^ (((152 + 154) - 295) + 184)] = Integer.valueOf((-((-37) & 27063)) & (-1) & 27583);
        numArr[(61 ^ 9) ^ (2 ^ 48)] = Integer.valueOf((-((-4298) & 31195)) & (-5189) & 32639);
        numArr[17 ^ 22] = Integer.valueOf((-5250) & 5807);
        numArr[32 ^ 40] = Integer.valueOf((-((-577) & 25173)) & (-3137) & 28287);
        numArr[137 ^ 128] = Integer.valueOf((-10396) & 12287);
        numArr[(195 ^ 185) ^ (231 ^ 151)] = Integer.valueOf((-((-14161) & 32764)) & (-12801) & 31743);
        numArr[84 ^ 95] = Integer.valueOf((-((-22113) & 30305)) & (-17937) & 26462);
        numArr[28 ^ 16] = Integer.valueOf((((((143 + 184) - 236) + 103) + (251 ^ 196)) - (((133 + 137) - 244) + 114)) + (118 ^ 31));
        numArr[188 ^ 177] = Integer.valueOf((-((-4259) & 29923)) & (-649) & 28668);
        return (String) Stream.of((Object[]) numArr).reduce("", str, num -> {
            return str + "," + num;
        }, (v0, v1) -> {
            return v0.concat(v1);
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 21, keyName = "enterBossRoom", name = "Enter the boss room", description = "Enters the boss room automatically", section = "Hunllef Fight")
    default boolean enterBossRoom() {
        return " ".length();
    }

    @ConfigItem(position = 41, keyName = "showDebug", name = "Display Infobox", description = "Displays debug infobox", section = "Debug")
    default boolean showDebugInfobox() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 8, keyName = "waitAfter", name = "Wait after attempt", description = "Makes the plugin wait (~30 - 60 seconds) after performing a kc to look more legitimate", section = "Gauntlet Entrance")
    default boolean waitAfterAttempt() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 7, keyName = "delayHopIfEmpty", name = "Delay hop if room is empty?", description = "Bypasses the above option if the room is already empty", section = "Gauntlet Entrance")
    default boolean delayHopIfEmpty() {
        return " ".length();
    }

    @ConfigItem(position = 6, keyName = "hopAfterKills", name = "Hop after x kills", description = "Makes the plugin hop after it has reached the specified amount of kills (0 = disabled)", section = "Gauntlet Entrance")
    @Range(max = 10)
    default int hopAfterKills() {
        return (139 ^ 144) ^ (178 ^ 173);
    }
}
