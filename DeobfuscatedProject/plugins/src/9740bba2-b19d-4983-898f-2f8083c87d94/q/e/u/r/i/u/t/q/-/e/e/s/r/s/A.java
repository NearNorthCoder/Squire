/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.a;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@TaskDesc(name="Completing Sheep Shearer")
public class A
extends Task {
    private static /* synthetic */ int[] lIIIllIIllIll;
    private static /* synthetic */ String[] lIIIllIIllIlI;
    private final /* synthetic */ SquireQuesterConfig bx;

    private static String lIlIIIlIIIlIIll(String lllllllllllllllIIIIlIlIIIIIIlIIl, String lllllllllllllllIIIIlIlIIIIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlIIIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIlIIIIIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIlIIIIIIllIl.init(lIIIllIIllIll[10], lllllllllllllllIIIIlIlIIIIIIlllI);
            return new String(lllllllllllllllIIIIlIlIIIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIlIIIIIIllII) {
            lllllllllllllllIIIIlIlIIIIIIllII.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        NPC lllllllllllllllIIIIlIlIIIIlllIlI2;
        A lllllllllllllllIIIIlIlIIIIlllIll;
        block27: {
            block26: {
                block25: {
                    if (A.lIlIIIlIIIlIllI(this.bx.quest().equals((Object)h.SHEEP_SHEARER) ? 1 : 0)) {
                        return lIIIllIIllIll[0];
                    }
                    if (A.lIlIIIlIIIlIlll(lllllllllllllllIIIIlIlIIIIlllIll.Q(), lIIIllIIllIll[1])) {
                        return lIIIllIIllIll[0];
                    }
                    System.out.println(lllllllllllllllIIIIlIlIIIIlllIll.Q());
                    if (!A.lIlIIIlIIIllIII(Inventory.getFreeSlots(), lIIIllIIllIll[2])) break block25;
                    int[] nArray = new int[lIIIllIIllIll[3]];
                    nArray[A.lIIIllIIllIll[0]] = lIIIllIIllIll[4];
                    if (!A.lIlIIIlIIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                    int[] nArray2 = new int[lIIIllIIllIll[3]];
                    nArray2[A.lIIIllIIllIll[0]] = lIIIllIIllIll[5];
                    if (!A.lIlIIIlIIIllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block26;
                }
                int[] nArray = new int[lIIIllIIllIll[3]];
                nArray[A.lIIIllIIllIll[0]] = lIIIllIIllIll[6];
                if (!A.lIlIIIlIIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                int[] nArray3 = new int[lIIIllIIllIll[3]];
                nArray3[A.lIIIllIIllIll[0]] = lIIIllIIllIll[7];
                if (!A.lIlIIIlIIIlIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block27;
            }
            if (A.lIlIIIlIIIlIllI(Bank.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIIllIll[3]];
                stringArray[A.lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[0]];
                List lllllllllllllllIIIIlIlIIIIlllIlI2 = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIIllIll[8], lIIIllIIllIll[9], lIIIllIIllIll[10]), (String[])stringArray);
                if (A.lIlIIIlIIIllIIl(lllllllllllllllIIIIlIlIIIIlllIlI2.isEmpty() ? 1 : 0)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[8], lIIIllIIllIll[11], lIIIllIIllIll[10]));
                    "".length();
                    return lIIIllIIllIll[0];
                }
                if (A.lIlIIIlIIIllIlI(lllllllllllllllIIIIlIlIIIIlllIlI2.size(), lIIIllIIllIll[3])) {
                    if (A.lIlIIIlIIIlIllI(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2.get(lIIIllIIllIll[0]))) ? 1 : 0)) {
                        Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[8], lIIIllIIllIll[11], lIIIllIIllIll[10]));
                        "".length();
                        return lIIIllIIllIll[0];
                    }
                    ((TileObject)lllllllllllllllIIIIlIlIIIIlllIlI2.get(lIIIllIIllIll[0])).interact(lIIIllIIllIlI[lIIIllIIllIll[3]]);
                }
                return lIIIllIIllIll[0];
            }
            if (A.lIlIIIlIIIllIII(Inventory.getFreeSlots(), lIIIllIIllIll[2])) {
                Bank.depositInventory();
            }
            if (A.lIlIIIlIIIllIIl(Bank.isOpen() ? 1 : 0) && A.lIlIIIlIIIllIIl(lllllllllllllllIIIIlIlIIIIlllIll.cx() ? 1 : 0)) {
                Bank.withdraw((int)lIIIllIIllIll[6], (int)lIIIllIIllIll[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                lllllllllllllllIIIIlIlIIIIlllIll.sleep(lIIIllIIllIll[3]);
            }
        }
        if (A.lIlIIIlIIIllIIl(Bank.isOpen() ? 1 : 0) && A.lIlIIIlIIIllIIl(lllllllllllllllIIIIlIlIIIIlllIll.cx() ? 1 : 0)) {
            Bank.withdraw((int)lIIIllIIllIll[6], (int)lIIIllIIllIll[3], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        }
        int[] nArray = new int[lIIIllIIllIll[3]];
        nArray[A.lIIIllIIllIll[0]] = lIIIllIIllIll[6];
        if (A.lIlIIIlIIIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIllIIllIll[3]];
            nArray4[A.lIIIllIIllIll[0]] = lIIIllIIllIll[7];
            if (A.lIlIIIlIIIlIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                if (A.lIlIIIlIIIllIIl(Shop.isOpen() ? 1 : 0)) {
                    Shop.buyOne((int)lIIIllIIllIll[7]);
                    return lIIIllIIllIll[0];
                }
                String[] stringArray = new String[lIIIllIIllIll[3]];
                stringArray[A.lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[10]];
                lllllllllllllllIIIIlIlIIIIlllIlI2 = NPCs.getNearest((String[])stringArray);
                if (A.lIlIIIlIIIllIll(lllllllllllllllIIIIlIlIIIIlllIlI2)) {
                    lllllllllllllllIIIIlIlIIIIlllIlI2.interact(lIIIllIIllIlI[lIIIllIIllIll[12]]);
                    return lIIIllIIllIll[0];
                }
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[13], lIIIllIIllIll[14], lIIIllIIllIll[0]));
                "".length();
            }
        }
        int[] nArray5 = new int[lIIIllIIllIll[3]];
        nArray5[A.lIIIllIIllIll[0]] = lIIIllIIllIll[7];
        if (A.lIlIIIlIIIllIIl(Inventory.contains((int[])nArray5) ? 1 : 0) && A.lIlIIIlIIIllIII(lllllllllllllllIIIIlIlIIIIlllIll.cb(), lIIIllIIllIll[2])) {
            lllllllllllllllIIIIlIlIIIIlllIlI2 = NPCs.getNearest(nPC -> {
                int n2;
                if (A.lIlIIIlIIIllIIl(nPC.getName().equals(lIIIllIIllIlI[lIIIllIIllIll[27]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIllIll[3]];
                    stringArray[A.lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[28]];
                    if (A.lIlIIIlIIIllIIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIIllIIllIll[3];
                        "".length();
                        if (-(0x29 ^ 0x53 ^ (0x74 ^ 0xA)) < 0) return n2 != 0;
                        return ((0x1E ^ 0x28 ^ (0x26 ^ 0xB)) & (0x53 ^ 0x66 ^ (0x63 ^ 0x4D) ^ -" ".length())) != 0;
                    }
                }
                n2 = lIIIllIIllIll[0];
                return n2 != 0;
            });
            if (A.lIlIIIlIIIllIll(lllllllllllllllIIIIlIlIIIIlllIlI2) && A.lIlIIIlIIIllIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2) ? 1 : 0) && A.lIlIIIlIIIlllII(lllllllllllllllIIIIlIlIIIIlllIlI2.getId(), lIIIllIIllIll[15])) {
                lllllllllllllllIIIIlIlIIIIlllIlI2.interact(lIIIllIIllIlI[lIIIllIIllIll[16]]);
                return lIIIllIIllIll[0];
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[17], lIIIllIIllIll[18], lIIIllIIllIll[0]));
            "".length();
        }
        if (A.lIlIIIlIIIllIlI(lllllllllllllllIIIIlIlIIIIlllIll.cb(), lIIIllIIllIll[2])) {
            int[] nArray6 = new int[lIIIllIIllIll[3]];
            nArray6[A.lIIIllIIllIll[0]] = lIIIllIIllIll[4];
            if (A.lIlIIIlIIIllIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                if (A.lIlIIIlIIIlllII(Players.getLocal().getAnimation(), lIIIllIIllIll[19])) {
                    return lIIIllIIllIll[0];
                }
                String[] stringArray = new String[lIIIllIIllIll[3]];
                stringArray[A.lIIIllIIllIll[0]] = lIIIllIIllIlI[lIIIllIIllIll[20]];
                lllllllllllllllIIIIlIlIIIIlllIlI2 = TileObjects.getNearest((String[])stringArray);
                if (A.lIlIIIlIIIllIll(lllllllllllllllIIIIlIlIIIIlllIlI2) && A.lIlIIIlIIIllIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2) ? 1 : 0)) {
                    if (A.lIlIIIlIIIlIllI(Production.isOpen() ? 1 : 0)) {
                        lllllllllllllllIIIIlIlIIIIlllIlI2.interact(lIIIllIIllIlI[lIIIllIIllIll[21]]);
                    }
                    Production.chooseOption((String)lIIIllIIllIlI[lIIIllIIllIll[22]]);
                    return lIIIllIIllIll[0];
                }
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[23], lIIIllIIllIll[24], lIIIllIIllIll[3]));
                "".length();
                return lIIIllIIllIll[0];
            }
            if (A.lIlIIIlIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIllIll[1]];
                dialogOptionArray[A.lIIIllIIllIll[0]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[3]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[A.lIIIllIIllIll[10]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[12]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[16]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[20]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[21]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[22]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[25]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[26]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[27]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArray[A.lIIIllIIllIll[28]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[29]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[30]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[31]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[32]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[33]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[34]] = DialogOption.NPC_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[35]] = DialogOption.PLAIN_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[36]] = DialogOption.PLAYER_CONTINUE;
                dialogOptionArray[A.lIIIllIIllIll[2]] = DialogOption.NPC_CONTINUE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return lIIIllIIllIll[0];
            }
            int[] nArray7 = new int[lIIIllIIllIll[3]];
            nArray7[A.lIIIllIIllIll[0]] = lIIIllIIllIll[37];
            lllllllllllllllIIIIlIlIIIIlllIlI2 = NPCs.getNearest((int[])nArray7);
            if (A.lIlIIIlIIIllIll(lllllllllllllllIIIIlIlIIIIlllIlI2) && A.lIlIIIlIIIllIIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIlIIIIlllIlI2) ? 1 : 0)) {
                lllllllllllllllIIIIlIlIIIIlllIlI2.interact(lIIIllIIllIlI[lIIIllIIllIll[25]]);
                return lIIIllIIllIll[0];
            }
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIllIll[38], lIIIllIIllIll[39], lIIIllIIllIll[0]));
            "".length();
        }
        return lIIIllIIllIll[3];
    }

    public boolean cx() {
        int[] nArray = new int[lIIIllIIllIll[3]];
        nArray[A.lIIIllIIllIll[0]] = lIIIllIIllIll[6];
        if (A.lIlIIIlIIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIIllIll[3]];
            nArray2[A.lIIIllIIllIll[0]] = lIIIllIIllIll[6];
            if (A.lIlIIIlIIIlIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                System.out.println(lIIIllIIllIlI[lIIIllIIllIll[26]]);
            }
            return lIIIllIIllIll[3];
        }
        return lIIIllIIllIll[0];
    }

    private int cb() {
        int[] nArray = new int[lIIIllIIllIll[3]];
        nArray[A.lIIIllIIllIll[0]] = lIIIllIIllIll[4];
        int[] nArray2 = new int[lIIIllIIllIll[3]];
        nArray2[A.lIIIllIIllIll[0]] = lIIIllIIllIll[5];
        return Inventory.getCount((int[])nArray) + Inventory.getCount((int[])nArray2);
    }

    @Inject
    public A(SquireQuesterConfig squireQuesterConfig) {
        this.bx = squireQuesterConfig;
    }

    private static boolean lIlIIIlIIIllIll(Object object) {
        return object != null;
    }

    private static void lIlIIIlIIIlIlII() {
        lIIIllIIllIlI = new String[lIIIllIIllIll[29]];
        A.lIIIllIIllIlI[A.lIIIllIIllIll[0]] = A.lIlIIIlIIIlIIIl("/DYjKG23LYzA2rxlN1JB9A==", "QvyRl");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[3]] = A.lIlIIIlIIIlIIlI("JwodBA==", "eksoB");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[10]] = A.lIlIIIlIIIlIIll("+tWUmzkGrQkvxgqVKMfIIA==", "IwSEG");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[12]] = A.lIlIIIlIIIlIIll("grWKPx289HY=", "naXht");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[16]] = A.lIlIIIlIIIlIIIl("rmi8Khz1xoY=", "afrhY");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[20]] = A.lIlIIIlIIIlIIll("U/mPwx/nvjrun0Vu7j+hMw==", "QoYCD");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[21]] = A.lIlIIIlIIIlIIlI("Hx8iIQ==", "LoKOR");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[22]] = A.lIlIIIlIIIlIIIl("eT1GA3eefoJ/CLPXBw0mpg==", "LwHfG");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[25]] = A.lIlIIIlIIIlIIlI("JSINH0sFLA==", "qCatf");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[26]] = A.lIlIIIlIIIlIIlI("AAB2FB8yAXYZFT4LJQ==", "WeVzz");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[27]] = A.lIlIIIlIIIlIIll("aiTg4skzp6Y=", "Uxjdi");
        A.lIIIllIIllIlI[A.lIIIllIIllIll[28]] = A.lIlIIIlIIIlIIlI("PAMiDQA=", "okGlr");
    }

    private static boolean lIlIIIlIIIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIIIlIIIlIlIl() {
        lIIIllIIllIll = new int[40];
        A.lIIIllIIllIll[0] = (0x28 ^ 0x19) & ~(1 ^ 0x30);
        A.lIIIllIIllIll[1] = 0x43 ^ 0x56;
        A.lIIIllIIllIll[2] = 0xB7 ^ 0xA3;
        A.lIIIllIIllIll[3] = " ".length();
        A.lIIIllIIllIll[4] = 0xFFFFFECF & 0x7F9;
        A.lIIIllIIllIll[5] = 0xFFFFDFFF & 0x26DF;
        A.lIIIllIIllIll[6] = 0xFFFF97F3 & 0x6BEF;
        A.lIIIllIIllIll[7] = 0xFFFF8EF7 & 0x77CF;
        A.lIIIllIIllIll[8] = 0xFFFF9FAF & 0x6CD8;
        A.lIIIllIIllIll[9] = 0xFFFFFCDF & 0xFB5;
        A.lIIIllIIllIll[10] = "  ".length();
        A.lIIIllIIllIll[11] = -(0xFFFFBF0D & 0x52FF) & (0xFFFF9EBF & 0x7FDE);
        A.lIIIllIIllIll[12] = "   ".length();
        A.lIIIllIIllIll[13] = 0xFFFF8C8B & Short.MAX_VALUE;
        A.lIIIllIIllIll[14] = 0xFFFFBDAD & 0x4EFF;
        A.lIIIllIIllIll[15] = -(0xFFFFD9B9 & 0x3F67) & (0xFFFF9FFB & 0x7BFF);
        A.lIIIllIIllIll[16] = 0xBA ^ 0xB7 ^ (0x53 ^ 0x5A);
        A.lIIIllIIllIll[17] = -(0xFFFFF17F & 0x5FEF) & (0xFFFFDFFE & 0x7DEF);
        A.lIIIllIIllIll[18] = 0xFFFFECC2 & 0x1FFD;
        A.lIIIllIIllIll[19] = -" ".length();
        A.lIIIllIIllIll[20] = 41 + 2 - -33 + 72 ^ 16 + 52 - -65 + 12;
        A.lIIIllIIllIll[21] = 0xFF ^ 0x91 ^ (0xDA ^ 0xB2);
        A.lIIIllIIllIll[22] = 0x23 ^ 0x24;
        A.lIIIllIIllIll[23] = -(0xFFFFEBBE & 0x3747) & (0xFFFFFFDF & 0x2FAF);
        A.lIIIllIIllIll[24] = 0xFFFFCC8E & 0x3FFF;
        A.lIIIllIIllIll[25] = 0xCB ^ 0xA3 ^ (0x24 ^ 0x44);
        A.lIIIllIIllIll[26] = 0x75 ^ 0x7C;
        A.lIIIllIIllIll[27] = 112 + 189 - 144 + 50 ^ 18 + 170 - 31 + 40;
        A.lIIIllIIllIll[28] = 7 ^ 0x4F ^ (0xA ^ 0x49);
        A.lIIIllIIllIll[29] = 0x34 ^ 0x38;
        A.lIIIllIIllIll[30] = 0xAB ^ 0xA6;
        A.lIIIllIIllIll[31] = 0xA ^ 4;
        A.lIIIllIIllIll[32] = 0x67 ^ 0x70 ^ (0x82 ^ 0x9A);
        A.lIIIllIIllIll[33] = 126 + 7 - 30 + 85 ^ 0 + 9 - -51 + 112;
        A.lIIIllIIllIll[34] = 0x4C ^ 0x38 ^ (0xD9 ^ 0xBC);
        A.lIIIllIIllIll[35] = 0x53 ^ 0 ^ (0xFE ^ 0xBF);
        A.lIIIllIIllIll[36] = 0x16 ^ 5;
        A.lIIIllIIllIll[37] = 0xFFFFD6DC & 0x2BFF;
        A.lIIIllIIllIll[38] = 0xFFFFBFFE & 0x4C77;
        A.lIIIllIIllIll[39] = 0xFFFFECDF & 0x1FE9;
    }

    private static boolean lIlIIIlIIIllIIl(int n2) {
        return n2 != 0;
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_SHEEP_SHEARER.c());
    }

    static {
        A.lIlIIIlIIIlIlIl();
        A.lIlIIIlIIIlIlII();
    }

    private static boolean lIlIIIlIIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIlIIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlIIIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIIlIIIlIIlI(String lllllllllllllllIIIIlIlIIIIlIIIII, String lllllllllllllllIIIIlIlIIIIIllIlI) {
        lllllllllllllllIIIIlIlIIIIlIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIlIIIIIllllI = new StringBuilder();
        char[] lllllllllllllllIIIIlIlIIIIIlllIl = lllllllllllllllIIIIlIlIIIIIllIlI.toCharArray();
        int lllllllllllllllIIIIlIlIIIIIlllII = lIIIllIIllIll[0];
        char[] lllllllllllllllIIIIlIlIIIIIlIllI = lllllllllllllllIIIIlIlIIIIlIIIII.toCharArray();
        int lllllllllllllllIIIIlIlIIIIIlIlIl = lllllllllllllllIIIIlIlIIIIIlIllI.length;
        int lllllllllllllllIIIIlIlIIIIIlIlII = lIIIllIIllIll[0];
        while (A.lIlIIIlIIIllIII(lllllllllllllllIIIIlIlIIIIIlIlII, lllllllllllllllIIIIlIlIIIIIlIlIl)) {
            char lllllllllllllllIIIIlIlIIIIlIIIIl = lllllllllllllllIIIIlIlIIIIIlIllI[lllllllllllllllIIIIlIlIIIIIlIlII];
            lllllllllllllllIIIIlIlIIIIIllllI.append((char)(lllllllllllllllIIIIlIlIIIIlIIIIl ^ lllllllllllllllIIIIlIlIIIIIlllIl[lllllllllllllllIIIIlIlIIIIIlllII % lllllllllllllllIIIIlIlIIIIIlllIl.length]));
            "".length();
            ++lllllllllllllllIIIIlIlIIIIIlllII;
            ++lllllllllllllllIIIIlIlIIIIIlIlII;
            "".length();
            if (" ".length() <= "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIlIIIIIllllI);
    }

    private static boolean lIlIIIlIIIlllII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIIIlIIIlIIIl(String lllllllllllllllIIIIlIlIIIIllIIII, String lllllllllllllllIIIIlIlIIIIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIlIIIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlIIIIlIllIl.getBytes(StandardCharsets.UTF_8)), lIIIllIIllIll[25]), "DES");
            Cipher lllllllllllllllIIIIlIlIIIIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIlIIIIllIIlI.init(lIIIllIIllIll[10], lllllllllllllllIIIIlIlIIIIllIIll);
            return new String(lllllllllllllllIIIIlIlIIIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIlIIIIllIIIl) {
            lllllllllllllllIIIIlIlIIIIllIIIl.printStackTrace();
            return null;
        }
    }
}

