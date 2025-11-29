/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.api.util.Text
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.basics.kitten;

import com.google.inject.Provides;
import gg.squire.basics.kitten.SquireKittenConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.kitten.GameEnum25;
import gg.squire.basics.kitten.HuntCatTask;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

@PluginDescriptor(name="Squire Kitten Feeder", description="Feeds your kitten/plays with it", enabledByDefault=false, tags={"cat", "spice", "rfd"})
@SquireUtil
public class SquireKitten
extends SquirePlugin {
    private  int dO;
    private  boolean dT;
    private static  int[] lIIllIlII;
    private  aB dR;
    private  int dP;
    private  aB dQ;
    private static final  int dN;
    private  int dS;
    private static  String[] lIIllIIll;

    private static void var1() {
        lIIllIlII = new int[26];
        SquireKitten.lIIllIlII[0] = (0xBF ^ 0xA1) & ~(0x27 ^ 0x39);
        SquireKitten.lIIllIlII[1] = 1;
        SquireKitten.lIIllIlII[2] = 2;
        SquireKitten.lIIllIlII[3] = 3;
        SquireKitten.lIIllIlII[4] = 0x58 ^ 0x71 ^ (0x4F ^ 0x62);
        SquireKitten.lIIllIlII[5] = 30 + 20 - 5 + 91 ^ 120 + 9 - 83 + 95;
        SquireKitten.lIIllIlII[6] = 0xAA ^ 0xAC;
        SquireKitten.lIIllIlII[7] = 0xFFFFF9BF & 0x7FF;
        SquireKitten.lIIllIlII[8] = -1;
        SquireKitten.lIIllIlII[9] = 2 ^ (0x4E ^ 0x6C);
        SquireKitten.lIIllIlII[10] = 0x38 ^ 0x2D ^ (0xAE ^ 0xBC);
        SquireKitten.lIIllIlII[11] = 0x7E ^ 0x55 ^ (0x24 ^ 0x1F);
        SquireKitten.lIIllIlII[12] = 0xB4 ^ 0xBC;
        SquireKitten.lIIllIlII[13] = 0xCF ^ 0xC5;
        SquireKitten.lIIllIlII[14] = 0xFFFFAE7E & 0x5DCF;
        SquireKitten.lIIllIlII[15] = -(0xFFFFEF67 & 0x5ABD) & (0xFFFFCFFF & 0x7B6F);
        SquireKitten.lIIllIlII[16] = -(0xFFFFBDA7 & 0x7EF9) & (0xFFFFBFF7 & 0x7DEF);
        SquireKitten.lIIllIlII[17] = -(0xFFFFBD3B & 0x4EF5) & (0xFFFF8D7F & Short.MAX_VALUE);
        SquireKitten.lIIllIlII[18] = -(0xFFFFBCA5 & 0x535B) & (0xFFFFBFFD & 0x7C3E);
        SquireKitten.lIIllIlII[19] = 0xFFFFFEBE & 0x2D7F;
        SquireKitten.lIIllIlII[20] = -(0xFFFFBCF3 & 0x6B1D) & (0xFFFFFFFF & 0x2977);
        SquireKitten.lIIllIlII[21] = 0xFFFFF56D & 0xBFB;
        SquireKitten.lIIllIlII[22] = -(0xFFFFE7D5 & 0x7E2B) & (0xFFFFEFFF & 0x7779);
        SquireKitten.lIIllIlII[23] = 37 + 90 - 111 + 141 ^ 84 + 17 - -19 + 28;
        SquireKitten.lIIllIlII[24] = 0xFFFFDB7F & 0x25FB;
        SquireKitten.lIIllIlII[25] = 0x27 ^ 0x2C;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void c(ChatMessage chatMessage) {
        void var2;
        if (SquireKitten.var3(chatMessage.getType(), ChatMessageType.SPAM) && SquireKitten.var3(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var4 = Text.removeTags((String)var2.getMessage());
        if (!SquireKitten.var5(var4.equals(lIIllIIll[lIIllIlII[0]]) ? 1 : 0) || SquireKitten.var6(var4.equals(lIIllIIll[lIIllIlII[1]]) ? 1 : 0)) {
            var7.dQ = aB.NONE;
        }
        if (SquireKitten.var6(var4.equals(lIIllIIll[lIIllIlII[2]]) ? 1 : 0)) {
            var7.dR = aB.NONE;
        }
        if (SquireKitten.var6(var4.equals(lIIllIIll[lIIllIlII[3]]) ? 1 : 0)) {
            var7.dQ = aB.SOME;
        }
        if (SquireKitten.var6(var4.equals(lIIllIIll[lIIllIlII[4]]) ? 1 : 0)) {
            var7.dQ = aB.EXTREME;
        }
        if (SquireKitten.var6(var4.equals(lIIllIIll[lIIllIlII[5]]) ? 1 : 0)) {
            var7.dR = aB.SOME;
        }
        if (SquireKitten.var6(var4.equals(lIIllIIll[lIIllIlII[6]]) ? 1 : 0)) {
            var7.dR = aB.EXTREME;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void v(int n2) {
        void var2_2;
        StringBuilder var8 = new StringBuilder(Integer.toBinaryString(n2));
        while (SquireKitten.var9(var8.length(), lIIllIlII[9])) {
            var8.insert(lIIllIlII[0], lIIllIIll[lIIllIlII[10]]);
            0;
            0;
            if (3 != ((0x84 ^ 0x9C ^ (0x49 ^ 0x69)) & (109 + 57 - 163 + 248 ^ 6 + 84 - 22 + 127 ^ -1))) continue;
            return;
        }
        this.dO = Integer.parseInt(var2_2.substring(lIIllIlII[0], lIIllIlII[11]), lIIllIlII[2]);
    }

    private static boolean var10(Object object, Object object2) {
        return object == object2;
    }

    private void bQ() {
        Client client = Static.getClient();
        if (SquireKitten.var3(client.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        int var11 = Vars.getVarp((int)lIIllIlII[7]);
        if (SquireKitten.var12(var11, lIIllIlII[8])) {
            SquireKitten var13;
            var13.dP = var11;
            var13.v(var13.dP);
        }
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    @Provides
    SquireKittenConfig l(ConfigManager configManager) {
        return (SquireKittenConfig)configManager.getConfig(SquireKittenConfig.class);
    }

    protected void onStart() {
        this.bQ();
    }

    public SquireKitten() {
        this.dO = lIIllIlII[0];
        this.dP = lIIllIlII[0];
        this.dQ = aB.NONE;
        this.dR = aB.SOME;
        this.dT = lIIllIlII[1];
    }

    public aB bS() {
        return this.dQ;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void d(VarbitChanged varbitChanged) {
        void var21;
        int n2 = Vars.getVarp((int)lIIllIlII[7]);
        if (SquireKitten.var22(n2, this.dP)) {
            return;
        }
        var23.dP = var21;
        if (SquireKitten.var22((int)var21, lIIllIlII[8])) {
            var23.dO = lIIllIlII[8];
            return;
        }
        this.v(this.dP);
    }

    private static void var24() {
        lIIllIIll = new String[lIIllIlII[25]];
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[0]] = "The kitten gobbles up the fish.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[1]] = "The kitten laps up the milk.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[2]] = "You softly stroke your cat.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[3]] = "Your kitten is hungry.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[4]] = "Your kitten is very hungry.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[5]] = "Your kitten wants attention.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[6]] = "Your kitten really wants attention.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[10]] = "0";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[12]] = "Stroke";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[23]] = "Interact";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[13]] = "Kitten";
    }

    static {
        SquireKitten.var1();
        SquireKitten.var24();
        dN = lIIllIlII[7];
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquireKitten var25;
        if (SquireKitten.var22(this.dO, lIIllIlII[8])) {
            return;
        }
        NPC var26 = NPCs.getNearest(nPC -> {
            int n2;
            if (SquireKitten.var22(nPC.getId(), this.dO) && SquireKitten.var6(lIIllIIll[lIIllIlII[13]].equals(nPC.getName()) ? 1 : 0) && SquireKitten.var10(nPC.getInteracting(), Players.getLocal())) {
                n2 = lIIllIlII[1];
                0;
                if null != null {
                    return ((0x9C ^ 0x8C ^ (0xD9 ^ 0x99)) & (128 + 39 - 157 + 244 ^ 115 + 121 - 200 + 138 ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlII[0];
            }
            return n2 != 0;
        });
        if (SquireKitten.var20(var26)) {
            return;
        }
        if (SquireKitten.var5(var25.dT) && SquireKitten.var6(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIllIlII[1]];
            stringArray[SquireKitten.lIIllIlII[0]] = lIIllIIll[lIIllIlII[12]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return;
        }
        if (SquireKitten.var5(var25.dT) && SquireKitten.var6(Dialog.isOpen() ? 1 : 0) && SquireKitten.var6(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            var25.dT = lIIllIlII[1];
            return;
        }
        int var27 = Static.getClient().getTickCount();
        if (SquireKitten.var28(var27 - var25.dS, lIIllIlII[5])) {
            return;
        }
        if (SquireKitten.var3((Object)var25.dQ, (Object)aB.NONE)) {
            int[] nArray = new int[lIIllIlII[13]];
            nArray[SquireKitten.lIIllIlII[0]] = lIIllIlII[14];
            nArray[SquireKitten.lIIllIlII[1]] = lIIllIlII[15];
            nArray[SquireKitten.lIIllIlII[2]] = lIIllIlII[16];
            nArray[SquireKitten.lIIllIlII[3]] = lIIllIlII[17];
            nArray[SquireKitten.lIIllIlII[4]] = lIIllIlII[18];
            nArray[SquireKitten.lIIllIlII[5]] = lIIllIlII[19];
            nArray[SquireKitten.lIIllIlII[6]] = lIIllIlII[20];
            nArray[SquireKitten.lIIllIlII[10]] = lIIllIlII[21];
            nArray[SquireKitten.lIIllIlII[12]] = lIIllIlII[22];
            nArray[SquireKitten.lIIllIlII[23]] = lIIllIlII[24];
            Item var29 = Inventory.getFirst((int[])nArray);
            if (SquireKitten.var30(var29)) {
                var29.useOn((Actor)var26);
                var25.dS = var27;
            }
        }
        if (SquireKitten.var3((Object)var25.dR, (Object)aB.NONE)) {
            var26.interact(lIIllIIll[lIIllIlII[23]]);
            var25.dS = var27;
            var25.dT = lIIllIlII[0];
        }
    }

    private static String var31(String var32, String var33) {
        var32 = new String(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var34 = new StringBuilder();
        char[] var35 = var33.toCharArray();
        int var36 = lIIllIlII[0];
        char[] var37 = var32.toCharArray();
        int var38 = var37.length;
        int var39 = lIIllIlII[0];
        while (SquireKitten.var9(var39, var38)) {
            char var40 = var37[var39];
            var34.append((char)(var40 ^ var35[var36 % var35.length]));
            0;
            ++var36;
            ++var39;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return String.valueOf(var34);
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIlII[1]];
        classArray[SquireKitten.lIIllIlII[0]] = HuntCatTask.class;
        return classArray;
    }

    protected void onStop() {
        this.dP = lIIllIlII[8];
        this.dO = lIIllIlII[8];
    }

    private static boolean var30(Object object) {
        return object != null;
    }

    public aB bT() {
        return this.dR;
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var28(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var46) {
            var46.printStackTrace();
            return null;
        }
    }

    private static boolean var22(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    public int bR() {
        return this.dO;
    }
}

