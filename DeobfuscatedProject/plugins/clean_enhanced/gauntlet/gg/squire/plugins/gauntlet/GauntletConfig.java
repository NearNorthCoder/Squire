/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Button
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.plugins.gauntlet;

import java.util.stream.Stream;
import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiregauntlet")
public interface GauntletConfig
extends Config {
    @ConfigSection(name="Debug", description="Debug overlays", position=40)
    public static final  String debugSection;
    @ConfigSection(name="Chatting", description="Chat related settings", position=30)
    public static final  String chatSection;
    @ConfigSection(name="Gauntlet Lobby", description="Settings related to the lobby", position=0)
    public static final  String entrySection;
    @ConfigSection(name="Boss", description="Boss related settings", position=20)
    public static final  String bossSection;
    @ConfigSection(name="Exploration", description="Settings related to exploration", position=10)
    public static final  String resourceSection;

    @ConfigItem(position=32, keyName="chatAfterKill", name="Responses to kc", description="Messages to send after every x kc", section="Chat Options", hidden=true)
    default public String messagesAfterKill() {
        return "5:cba anymore;fuck gauntlet;ugh";
    }

    @ConfigItem(position=29, keyName="safeBossFight", name="Focus on safety over speed", description="Increases tornado dodge range and disables melee during tornadoes for extra safety", section="Hunllef Fight")
    default public boolean safeBossFight() {
        return ((125 + 51 - 88 + 55 ^ 169 + 174 - 309 + 148) & (0x42 ^ 0x7D ^ (0x71 ^ 0x77) ^ -1)) != 0;
    }

    @ConfigItem(position=44, keyName="onlyHandlePrayers", name="Only handle prayers", description="Doesn't do anything but handle prayers", section="Debug")
    default public boolean onlyHandlePrayers() {
        return ((0x8B ^ 0xB1) & ~(0x4B ^ 0x71)) != 0;
    }

    @ConfigItem(position=13, keyName="potionGoal", name="Amount of potions", description="The number of potions you want to make for the Hunleff fight", section="Resources")
    default public int potionGoal() {
        return 1;
    }

    @ConfigItem(position=16, keyName="t3Home", name="Go home for t3 staff", description="Goes home after getting t3 staff to make it and save some time for killing extra t1/t2/t3.", section="Resources", hidden=true, unhide="t3Offhand", unhideValue="true", disabledBy="t2Offhand", disabledByValue="true")
    default public boolean goHomeT3() {
        return ((149 + 20 - 163 + 243 ^ 38 + 131 - 128 + 129) & (189 + 135 - 287 + 201 ^ 80 + 4 - -30 + 75 ^ -1)) != 0;
    }

    @ConfigItem(position=11, keyName="fishGoal", name="Amount of fish", description="The number of fish you want to have for the Hunleff fight", section="Resources")
    default public int fishGoal() {
        return 0x2F ^ 0x4D ^ (0xA8 ^ 0xC6);
    }

    static {
        chatSection = "Chat Options";
        debugSection = "Debug";
        resourceSection = "Resources";
        bossSection = "Hunllef Fight";
        entrySection = "Gauntlet Entrance";
    }

    @ConfigItem(position=42, keyName="showDebugExtra", name="Adds extra info to box", description="Adds required items and required crafting to infobox", section="Debug")
    default public boolean showDebugInfoboxAll() {
        return ((0x22 ^ 0x28) & ~(0xC9 ^ 0xC3)) != 0;
    }

    @ConfigItem(position=43, keyName="showDebugOverlay", name="Display Map Overlay", description="Displays debug overlay", section="Debug")
    default public boolean showDebugOverlay() {
        return ((0x69 ^ 0x72 ^ (0x3C ^ 0x1B)) & (0xD4 ^ 0xAA ^ (0xEE ^ 0xAC) ^ -1)) != 0;
    }

    @ConfigItem(position=31, keyName="chattingEnabled", name="Enable chatting", description="Enables chatting using the following messages", section="Chat Options")
    default public boolean enableChatting() {
        return ((0x3E ^ 0x6E ^ (8 ^ 0x42)) & (0x3C ^ 0x46 ^ (0xD6 ^ 0xB6) ^ -1)) != 0;
    }

    @ConfigItem(position=27, keyName="redemptionFlick", name="Flick redemption prayer", description="Uses redemption to heal up if it's possible and/or necessary", section="Hunllef Fight")
    default public boolean flickRedemption() {
        return 1 != 0;
    }

    @ConfigItem(position=1, keyName="corruptedMode", name="Corrupted gauntlet mode", description="Enters the corrupted version of the gauntlet", section="Gauntlet Entrance")
    default public boolean corruptedMode() {
        return ((0xC8 ^ 0x81 ^ (0x92 ^ 0x82)) & (0x66 ^ 0x1B ^ (0x8E ^ 0xAA) ^ -1)) != 0;
    }

    @ConfigItem(position=28, keyName="1tFlickBoss", name="1T Flick boss fight", description="Uses no prayer points in the boss fight through 1t flicking", section="Hunllef Fight")
    default public boolean flickBossFight() {
        return 1 != 0;
    }

    @Range(max=79)
    @ConfigItem(position=25, keyName="eatBelowNonados", name="Idle hitpoints to eat below", description="HP to eat at (not running from tornadoes)", section="Hunllef Fight")
    default public int eatBelowNoNados() {
        return 0x5B ^ 0x5F ^ (0x2C ^ 0x3E);
    }

    @ConfigItem(position=14, keyName="t2Offhand", name="Make your offhand weapon t2", description="Looks for more crystals to make the offhand weapon T2 (bow/staff depending on cycle)", section="Resources", disabledBy="t3Offhand", disabledByValue="true")
    default public boolean makeT2Offhand() {
        return ((8 ^ 0x5D ^ (0x1D ^ 0x5D)) & (0x94 ^ 0xA9 ^ (0x34 ^ 0x1C) ^ -1)) != 0;
    }

    @Range(max=5)
    @ConfigItem(position=12, keyName="fishGoalMin", name="Fish goal deviation", description="Should we enter the boss fight when we are missing the fish goal by this amount?", section="Resources")
    default public int fishGoalDeviation() {
        return 1;
    }

    @ConfigItem(position=5, keyName="stopAtKc", name="Stop after x kills", description="Stops this plugin after it has reached the specified amount of kills (0 = disabled)", section="Gauntlet Entrance")
    @Range(max=25)
    default public int stopAtKc() {
        return (2 ^ (0x51 ^ 0x45)) & (0x40 ^ 0x73 ^ (0x54 ^ 0x71) ^ -1);
    }

    @ConfigItem(position=15, keyName="t3Offhand", name="Use two t3 weapons", description="Tries to kill two demi-bosses for two t3 weapons instead of doing 5:1, can be slower but more consistent.", section="Resources", disabledBy="t2Offhand", disabledByValue="true")
    default public boolean makeT3Offhand() {
        return ((0xCF ^ 0x96) & ~(0xE4 ^ 0xBD)) != 0;
    }

    @ConfigItem(position=3, keyName="alching", name="Items to alch", description="High alch these items when you loot", section="Gauntlet Entrance")
    default public String alching() {
        Integer[] integerArray = new Integer[8 ^ 0x64 ^ (0x59 ^ 0x22)];
        integerArray[(42 + 112 - 18 + 6 ^ 127 + 36 - 64 + 68) & (70 + 13 - 81 + 151 ^ 117 + 79 - 46 + 26 ^ -1) & ((0xA0 ^ 0xC2 ^ (0xD ^ 0x28)) & (0x2E ^ 0xD ^ (0xE1 ^ 0x85) ^ -1) ^ -1)] = -(0xFFFFFDE7 & 0x3359) & (0xFFFFBFFB & 0x75FF);
        integerArray[1] = 0xFFFFD7DB & 0x2CAD;
        integerArray[2] = -(0xFFFFF87F & 0x17EA) & (0xFFFFDFFF & 0x35FF);
        integerArray["   ".length()] = -(0xFFFFCEFB & 0x7B0D) & (0xFFFFFFFF & 0x4EFF);
        integerArray[0xD6 ^ 0xA7 ^ (0x3C ^ 0x49)] = -(0xFFFF9299 & 0x7F7F) & (0xFFFFD6FB & 0x3F7F);
        integerArray[0x78 ^ 0x7D] = 0xFFFFE773 & 0x1CBD;
        integerArray[0xB1 ^ 0xB7] = -(0xFFFFEA3D & Short.MAX_VALUE) & (0xFFFFEFFF & 0x7E7F);
        integerArray[80 + 142 - 159 + 85 ^ 75 + 113 - 114 + 73] = -(0xFFFFD9C9 & 0x76F7) & (0xFFFFD5FB & 0x7FF7);
        integerArray[123 + 136 - 223 + 121 ^ 8 + 82 - 29 + 88] = -(0xFFFFFDC7 & 0x1E3B) & (0xFFFFBF5E & 0x5FF7);
        integerArray[0x62 ^ 0x4C ^ (0x92 ^ 0xB5)] = 0xFFFFC77E & 0x3BD7;
        integerArray[0x44 ^ 0x20 ^ (0xD5 ^ 0xBB)] = -(0xFFFFBD6B & 0x5BFD) & (0xFFFFDFEF & 0x3DFF);
        integerArray[0x4A ^ 0x41] = -(0xFFFFF6AD & 0x5973) & (0xFFFFDDF5 & 0x77BF);
        integerArray[0x35 ^ 0x39] = 0xFFFFE4F3 & 0x1F6D;
        integerArray[110 + 85 - 180 + 155 ^ 88 + 18 - 82 + 143] = 0xFFFFAEFF & 0x552F;
        integerArray[0x4B ^ 0x45] = -(0xFFFFEDFF & 0x5BC1) & (0xFFFFFDFF & 0x4FFD);
        integerArray[0xF7 ^ 0x84 ^ (0x44 ^ 0x38)] = 0xFFFFBC9F & 0x4FE5;
        integerArray[0x9A ^ 0xA8 ^ (0x1B ^ 0x39)] = -(0xFFFFF8FB & 0x47CC) & (0xFFFFFEFF & 0x45FF);
        integerArray[145 + 107 - 226 + 182 ^ 24 + 97 - 8 + 80] = 0xFFFFBCBE & 0x47CD;
        integerArray[0x45 ^ 0x57] = 0xFFFFADFF & 0x56FC;
        integerArray[0xCA ^ 0xBC ^ (0xF3 ^ 0x96)] = -(0xFFFFF2CF & 0x2FB5) & (0xFFFFEEDF & 0x37FE);
        integerArray[0x20 ^ 0x7E ^ (0x6A ^ 0x20)] = 0xFFFFCEEB & 0x3D97;
        integerArray[8 ^ 0x1D] = 0xFFFFC647 & 0x3DFE;
        integerArray[0xBE ^ 0xA8] = -(0xFFFFF19F & 0x1FE3) & (0xFFFFB5FB & 0x5FEE);
        return Stream.of(integerArray).reduce("", (string, n2) -> string + "," + n2, String::concat);
    }

    @ConfigItem(position=32, keyName="chatAfterLoot", name="Responses to my loot", description="Messages to send after our loot, check discord for configuration", section="Chat Options")
    default public String messagesAfterLoot() {
        return "enhanced:finally!!!!!;omggggg yessssss :DDDD;easy money lol";
    }

    @Range(max=99)
    @ConfigItem(position=26, keyName="eatToDuringNados", name="Hitpoints to eat until during danger", description="Hitpoints to eat until during danger, such as running from tornadoes or tiles", section="Hunllef Fight")
    default public int eatToDuringNados() {
        return 0x6F ^ 0x44 ^ (0 ^ 0x60);
    }

    @ConfigItem(position=4, keyName="deposit", name="Deposit items at the box", description="Deposit all items in the bank when your inventory is getting full", section="Gauntlet Entrance")
    default public boolean deposit() {
        return 1 != 0;
    }

    @ConfigItem(position=9, keyName="hopUntilEmpty", name="Hop until empty room", description="Makes the plugin hop until an empty room for looting", section="Gauntlet Entrance")
    default public boolean hopUntilEmpty() {
        return 1 != 0;
    }

    @ConfigItem(position=45, keyName="pauseTasks", name="Pause/Resume Execution", description="Pauses/resumes all current tasks", section="Debug")
    default public Button pauseTasks() {
        return new Button();
    }

    @ConfigItem(position=12, keyName="fishGoalAbort", name="Abort fish amount", description="If we have less than or equal to this amount in (cooked) fish before starting the fight, we will abort and try again.", section="Resources")
    @Range(max=18)
    default public int abortFishAmount() {
        return 0x33 ^ 0x3B;
    }

    @ConfigItem(position=17, keyName="flickMonsters", name="1t pray flick monsters", description="Uses 1t pray flicking to save on prayer", section="Resources")
    default public boolean flickMonsters() {
        return ((0xA6 ^ 0xAA) & ~(0xC ^ 0)) != 0;
    }

    @ConfigItem(position=32, keyName="chatAfterGlobal", name="Responses to other loots", description="Messages to send after world kills", section="Chat Options")
    default public String messagesAfterChat() {
        return "enhanced:gz lol;gz...;nice";
    }

    @ConfigItem(position=16, keyName="makeArmour", name="Make t1 armour", description="Gets the resources for t1 armour", section="Resources")
    default public boolean makeArmour() {
        return ((0x74 ^ 0x17) & ~(0x5B ^ 0x38)) != 0;
    }

    @ConfigItem(position=2, keyName="dropping", name="Items to drop", description="Drop these items when you loot", section="Gauntlet Entrance")
    default public String dropping() {
        Integer[] integerArray = new Integer[0x6A ^ 0x64];
        integerArray[(0x73 ^ 0x3C) & (0xFC ^ 0xB3 ^ 0xFFFFFFFF)] = 0xFFFFDF76 & 0x7CFF;
        integerArray[1] = 24 + 189 - 18 + 0;
        integerArray[2] = -(0xFFFFF69F & 0xD69) & (0xFFFF8DDE & Short.MAX_VALUE);
        integerArray["   ".length()] = -(0xFFFF9DF7 & 0x77CB) & (0xFFFF97FF & 0x7FEE);
        integerArray[0x5F ^ 0x70 ^ (0xA7 ^ 0x8C)] = -(0xFFFFFCD1 & 0x5F3F) & (0xFFFFDFFF & 0x7E3F);
        integerArray[159 + 184 - 269 + 124 ^ 152 + 154 - 295 + 184] = -(0xFFFFFFDB & 0x69B7) & (0xFFFFFFFF & 0x6BBF);
        integerArray[0x3D ^ 9 ^ (2 ^ 0x30)] = -(0xFFFFEF36 & 0x79DB) & (0xFFFFEBBB & 0x7F7F);
        integerArray[0x11 ^ 0x16] = 0xFFFFEB7E & 0x16AF;
        integerArray[0x20 ^ 0x28] = -(0xFFFFFDBF & 0x6255) & (0xFFFFF3BF & 0x6E7F);
        integerArray[0x89 ^ 0x80] = 0xFFFFD764 & 0x2FFF;
        integerArray[0xC3 ^ 0xB9 ^ (0xE7 ^ 0x97)] = -(0xFFFFC8AF & 0x7FFC) & (0xFFFFCDFF & 0x7BFF);
        integerArray[0x54 ^ 0x5F] = -(0xFFFFA99F & 0x7661) & (0xFFFFB9EF & 0x675E);
        integerArray[0x1C ^ 0x10] = 143 + 184 - 236 + 103 + (0xFB ^ 0xC4) - (133 + 137 - 244 + 114) + (0x76 ^ 0x1F);
        integerArray[0xBC ^ 0xB1] = -(0xFFFFEF5D & 0x74E3) & (0xFFFFFD77 & 0x6FFC);
        return Stream.of(integerArray).reduce("", (string, n2) -> string + "," + n2, String::concat);
    }

    @ConfigItem(position=21, keyName="enterBossRoom", name="Enter the boss room", description="Enters the boss room automatically", section="Hunllef Fight")
    default public boolean enterBossRoom() {
        return 1 != 0;
    }

    @ConfigItem(position=41, keyName="showDebug", name="Display Infobox", description="Displays debug infobox", section="Debug")
    default public boolean showDebugInfobox() {
        return ((0xB3 ^ 0xBB) & ~(0x9E ^ 0x96)) != 0;
    }

    @ConfigItem(position=8, keyName="waitAfter", name="Wait after attempt", description="Makes the plugin wait (~30 - 60 seconds) after performing a kc to look more legitimate", section="Gauntlet Entrance")
    default public boolean waitAfterAttempt() {
        return 1 != 0;
    }

    @ConfigItem(position=7, keyName="delayHopIfEmpty", name="Delay hop if room is empty?", description="Bypasses the above option if the room is already empty", section="Gauntlet Entrance")
    default public boolean delayHopIfEmpty() {
        return 1 != 0;
    }

    @Range(max=10)
    @ConfigItem(position=6, keyName="hopAfterKills", name="Hop after x kills", description="Makes the plugin hop after it has reached the specified amount of kills (0 = disabled)", section="Gauntlet Entrance")
    default public int hopAfterKills() {
        return 0x8B ^ 0x90 ^ (0xB2 ^ 0xAD);
    }
}

