package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.al  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/al.class */
public class C0012al implements InterfaceC0003ac {
    static /* synthetic */ WorldPoint cl;
    static /* synthetic */ WorldPoint ck;
    private static /* synthetic */ int[] lIllllllll;
    public static /* synthetic */ boolean ci;
    static /* synthetic */ WorldArea cj;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] lIlllllllI;

    public static void aq() {
        if (lIlIIIIlllIlI(Widgets.get(lIllllllll[51], lIllllllll[52]))) {
            AccBuilderSotf.c = lIlllllllI[lIllllllll[53]];
            Widgets.get(lIllllllll[51], lIllllllll[52]).interact(lIlllllllI[lIllllllll[54]]);
            Time.sleepTicks(lIllllllll[7]);
            "".length();
        }
        if (lIlIIIIlllllI(Widgets.get(lIllllllll[51], lIllllllll[52])) && lIlIIIIlllIIl(Widgets.get(lIllllllll[55]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIllllllll[1]);
            "".length();
            if (lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[19])) {
                Widgets.get(lIllllllll[55], lIllllllll[1]).getChild(lIllllllll[1]).interact(lIlllllllI[lIllllllll[56]]);
            }
            if (lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[32]) && lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[19])) {
                Widgets.get(lIllllllll[55], lIllllllll[1]).getChild(lIllllllll[3]).interact(lIlllllllI[lIllllllll[57]]);
            }
            if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[32]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[39])) {
                Widgets.get(lIllllllll[55], lIllllllll[1]).getChild(lIllllllll[4]).interact(lIlllllllI[lIllllllll[58]]);
            }
            if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[32])) {
                int[] iArr = new int[lIllllllll[1]];
                iArr[lIllllllll[0]] = lIllllllll[14];
                if (lIlIIIIlllIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIllllllll[55], lIllllllll[1]).getChild(lIllllllll[4]).interact(lIlllllllI[lIllllllll[21]]);
                }
            }
            if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[39])) {
                int[] iArr2 = new int[lIllllllll[1]];
                iArr2[lIllllllll[0]] = lIllllllll[14];
                if (lIlIIIIllIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIllllllll[55], lIllllllll[1]).getChild(lIllllllll[7]).interact(lIlllllllI[lIllllllll[52]]);
                }
            }
            Time.sleepTicks(lIllllllll[1]);
            "".length();
        }
    }

    private static String lIlIIIIllIIll(String llllllllllllllllllIllIlllIIlllIl, String llllllllllllllllllIllIlllIIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIlllIIlllII.getBytes(StandardCharsets.UTF_8)), lIllllllll[30]), "DES");
            Cipher llllllllllllllllllIllIlllIIlllll = Cipher.getInstance("DES");
            llllllllllllllllllIllIlllIIlllll.init(lIllllllll[3], secretKeySpec);
            return new String(llllllllllllllllllIllIlllIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIlllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIlllIIllllI) {
            llllllllllllllllllIllIlllIIllllI.printStackTrace();
            return null;
        }
    }

    private static void am() {
        if (lIlIIIlIIIIII(lIlIIIIllllll(C0018e.w(), 30.0d))) {
            int[] iArr = new int[lIllllllll[1]];
            iArr[lIllllllll[0]] = lIllllllll[20];
            if (lIlIIIIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllllllll[1]];
                iArr2[lIllllllll[0]] = lIllllllll[20];
                Inventory.getFirst(iArr2).interact(lIlllllllI[lIllllllll[45]]);
                Time.sleepTicks(lIllllllll[1]);
                "".length();
            }
        }
        if (lIlIIIIlllllI(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlIIIIllIlll(npc.getName().contains(lIlllllllI[lIllllllll[76]]) ? 1 : 0) && lIlIIIIlllIIl(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIllllllll[1];
                    "".length();
                    return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllllllll[0];
            });
            String[] strArr = new String[lIllllllll[3]];
            strArr[lIllllllll[0]] = lIlllllllI[lIllllllll[46]];
            strArr[lIllllllll[1]] = lIlllllllI[lIllllllll[47]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIlIIIlIIIIIl(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIllllllll[1];
                    "".length();
                    return "   ".length() < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllllllll[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIllllllll[1]];
            iArr3[lIllllllll[0]] = lIllllllll[48];
            if (lIlIIIIllIlll(Equipment.contains(iArr3) ? 1 : 0) && lIlIIIIlllIIl(ap() ? 1 : 0)) {
                aq();
            }
            if (lIlIIIIlllIlI(nearest) && lIlIIIIlllIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lIlllllllI[lIllllllll[49]]);
                Time.sleepTicks(lIllllllll[4]);
                "".length();
            }
        }
    }

    private static void lIlIIIIllIlIl() {
        lIlllllllI = new String[lIllllllll[81]];
        lIlllllllI[lIllllllll[0]] = lIlIIIIllIIlI("iOXV1mH3Dil9oQj1+Gtqjg==", "FWvuG");
        lIlllllllI[lIllllllll[1]] = lIlIIIIllIIll("XHRUO/a0cklBLDqEejLkbCPUoYuJlwmbzzhLObhdp6D+cOwft1KBhOP+I85LTRdCEsMkTRmVjwc=", "wPylJ");
        lIlllllllI[lIllllllll[3]] = lIlIIIIllIlII("LzIgHw0AJz8YDUEnOVYIAD09", "aSVvj");
        lIlllllllI[lIllllllll[4]] = lIlIIIIllIIll("oQJ6HkJVmLzrLJ4YpVexz9IFG2+He4PD", "oZqCP");
        lIlllllllI[lIllllllll[7]] = lIlIIIIllIlII("IgdXJjYQQhouNwYLGSBkBhcHNygcBwRrZAYVHjMnHQsZIGQBDVcFESwrOQA=", "ubwGD");
        lIlllllllI[lIllllllll[19]] = lIlIIIIllIIlI("yLcWOvTuE90Bxb1ZkK61vg==", "JqIRm");
        lIlllllllI[lIllllllll[6]] = lIlIIIIllIIll("eWPjhYnunHR4Hng6sjN1nA==", "rjzoO");
        lIlllllllI[lIllllllll[27]] = lIlIIIIllIlII("ARU4HA0sE2seBTAGJAsPYgAuBAE=", "BtKhd");
        lIlllllllI[lIllllllll[30]] = lIlIIIIllIlII("FScxMC04IWIoMTskO2QwMyon", "VFBDD");
        lIlllllllI[lIllllllll[32]] = lIlIIIIllIlII("GjIJAx83NFoRFzU/A1cCPD8f", "YSzwv");
        lIlllllllI[lIllllllll[33]] = lIlIIIIllIlII("OykeLicWL005LxUlFHo6HSQI", "xHmZN");
        lIlllllllI[lIllllllll[34]] = lIlIIIIllIIll("QL1IpOy40Ro=", "kfdEG");
        lIlllllllI[lIllllllll[37]] = lIlIIIIllIIlI("/omSjdCyPYo=", "DfQuz");
        lIlllllllI[lIllllllll[39]] = lIlIIIIllIIll("5H4o7ed70rrsYwr7VF4u0jLCtKVCKRPn", "JTxgw");
        lIlllllllI[lIllllllll[43]] = lIlIIIIllIIll("UHhWPYwHC97ZJnVbFw0mYA==", "PYdOv");
        lIlllllllI[lIllllllll[44]] = lIlIIIIllIIll("jj4uQpeqQl9yIfw5EAsz/Q==", "bDJaN");
        lIlllllllI[lIllllllll[45]] = lIlIIIIllIlII("CTMM", "LRxax");
        lIlllllllI[lIllllllll[46]] = lIlIIIIllIIll("woImsgXZ7hY=", "gVUsn");
        lIlllllllI[lIllllllll[47]] = lIlIIIIllIIll("VcsKJxuLA64=", "DBxze");
        lIlllllllI[lIllllllll[49]] = lIlIIIIllIIlI("m1WYd3SeFBs=", "iuVft");
        lIlllllllI[lIllllllll[53]] = lIlIIIIllIIlI("4YWvx9LPubVE/EtBhFlPcVkxcV+JGlma", "AaGFp");
        lIlllllllI[lIllllllll[54]] = lIlIIIIllIlII("Oh8aIh0cVwY9CxUb", "ywuMn");
        lIlllllllI[lIllllllll[56]] = lIlIIIIllIlII("FSgbEFURNQcdHic=", "BAutu");
        lIlllllllI[lIllllllll[57]] = lIlIIIIllIIll("ekBkKSc1U4uLEYQj6PqJLA==", "SnJBM");
        lIlllllllI[lIllllllll[58]] = lIlIIIIllIIll("vQr1fCG791xEdsOOponUfw==", "WrwSS");
        lIlllllllI[lIllllllll[21]] = lIlIIIIllIIlI("5mROpJTf2uOG/xdRN/+spA==", "gTIqQ");
        lIlllllllI[lIllllllll[52]] = lIlIIIIllIIll("aKfrGTP4iTisUMgp1R/UAg==", "VWRTP");
        lIlllllllI[lIllllllll[74]] = lIlIIIIllIlII("Gy0/GTF2OCoROzglNhc=", "VLXpR");
        lIlllllllI[lIllllllll[75]] = lIlIIIIllIIlI("DzNorDYgk04UBGgXoxAhhxxu/i1lwh9/", "rOuul");
        lIlllllllI[lIllllllll[76]] = lIlIIIIllIIll("JaoZQ+K5Pvk=", "VGqDk");
    }

    private static boolean lIlIIIIlllIlI(Object obj) {
        return obj != null;
    }

    private static void Q() {
        if (lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[8])) {
            int[] iArr = new int[lIllllllll[1]];
            iArr[lIllllllll[0]] = lIllllllll[16];
            if (lIlIIIIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(lIllllllll[16], lIllllllll[59], lIllllllll[60]));
                "".length();
            }
            int[] iArr2 = new int[lIllllllll[1]];
            iArr2[lIllllllll[0]] = lIllllllll[9];
            if (lIlIIIIlllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(lIllllllll[9], lIllllllll[61], lIllllllll[6]));
                "".length();
            }
            int[] iArr3 = new int[lIllllllll[1]];
            iArr3[lIllllllll[0]] = lIllllllll[11];
            if (lIlIIIIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0017d(lIllllllll[11], lIllllllll[62], lIllllllll[6]));
                "".length();
            }
            int[] iArr4 = new int[lIllllllll[1]];
            iArr4[lIllllllll[0]] = lIllllllll[13];
            if (lIlIIIIlllIIl(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0017d(lIllllllll[13], lIllllllll[63], lIllllllll[6]));
                "".length();
            }
            int[] iArr5 = new int[lIllllllll[1]];
            iArr5[lIllllllll[0]] = lIllllllll[14];
            if (lIlIIIIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0017d(lIllllllll[14], lIllllllll[5], lIllllllll[6]));
                "".length();
            }
            int[] iArr6 = new int[lIllllllll[1]];
            iArr6[lIllllllll[0]] = lIllllllll[48];
            if (lIlIIIIlllIIl(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0017d(lIllllllll[48], lIllllllll[1], C0018e.c(lIllllllll[64], lIllllllll[65])));
                "".length();
            }
        }
        if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[8])) {
            int[] iArr7 = new int[lIllllllll[1]];
            iArr7[lIllllllll[0]] = lIllllllll[24];
            if (lIlIIIIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIllllllll[1]];
                iArr8[lIllllllll[0]] = lIllllllll[24];
                if (lIlIIIIlllIII(Bank.getFirst(iArr8).getQuantity(), lIllllllll[63])) {
                    int i = lIllllllll[24];
                    int i2 = lIllllllll[63];
                    int[] iArr9 = new int[lIllllllll[1]];
                    iArr9[lIllllllll[0]] = lIllllllll[24];
                    bv.add(new C0017d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIllllllll[66]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIllllllll[1]];
            iArr10[lIllllllll[0]] = lIllllllll[24];
            if (lIlIIIIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0017d(lIllllllll[24], lIllllllll[63], lIllllllll[66]));
                "".length();
            }
            int[] iArr11 = new int[lIllllllll[1]];
            iArr11[lIllllllll[0]] = lIllllllll[25];
            if (lIlIIIIllIlll(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIllllllll[1]];
                iArr12[lIllllllll[0]] = lIllllllll[25];
                if (lIlIIIIlllIII(Bank.getFirst(iArr12).getQuantity(), lIllllllll[63])) {
                    int i3 = lIllllllll[25];
                    int i4 = lIllllllll[63];
                    int[] iArr13 = new int[lIllllllll[1]];
                    iArr13[lIllllllll[0]] = lIllllllll[25];
                    bv.add(new C0017d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIllllllll[67]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIllllllll[1]];
            iArr14[lIllllllll[0]] = lIllllllll[25];
            if (lIlIIIIlllIIl(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0017d(lIllllllll[25], lIllllllll[63], lIllllllll[67]));
                "".length();
            }
            int[] iArr15 = new int[lIllllllll[1]];
            iArr15[lIllllllll[0]] = lIllllllll[22];
            if (lIlIIIIlllIIl(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIllllllll[1]];
                iArr16[lIllllllll[0]] = lIllllllll[22];
                if (lIlIIIIlllIIl(Equipment.contains(iArr16) ? 1 : 0)) {
                    bv.add(new C0017d(lIllllllll[22], lIllllllll[1], lIllllllll[68]));
                    "".length();
                }
            }
            if (lIlIIIIllIlll(ci ? 1 : 0)) {
                int[] iArr17 = new int[lIllllllll[1]];
                iArr17[lIllllllll[0]] = lIllllllll[16];
                if (lIlIIIIllIlll(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIllllllll[1]];
                    iArr18[lIllllllll[0]] = lIllllllll[16];
                    if (lIlIIIIlllIII(Bank.getFirst(iArr18).getQuantity(), lIllllllll[63])) {
                        int i5 = lIllllllll[16];
                        int i6 = lIllllllll[63];
                        int[] iArr19 = new int[lIllllllll[1]];
                        iArr19[lIllllllll[0]] = lIllllllll[16];
                        bv.add(new C0017d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIllllllll[60]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIllllllll[1]];
                iArr20[lIllllllll[0]] = lIllllllll[16];
                if (lIlIIIIlllIIl(Bank.contains(iArr20) ? 1 : 0)) {
                    bv.add(new C0017d(lIllllllll[16], lIllllllll[63], lIllllllll[60]));
                    "".length();
                }
                int[] iArr21 = new int[lIllllllll[1]];
                iArr21[lIllllllll[0]] = lIllllllll[23];
                if (lIlIIIIllIlll(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIllllllll[1]];
                    iArr22[lIllllllll[0]] = lIllllllll[23];
                    if (lIlIIIIlllIII(Bank.getFirst(iArr22).getQuantity(), lIllllllll[68])) {
                        int i7 = lIllllllll[23];
                        int i8 = lIllllllll[68];
                        int[] iArr23 = new int[lIllllllll[1]];
                        iArr23[lIllllllll[0]] = lIllllllll[23];
                        bv.add(new C0017d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIllllllll[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIllllllll[1]];
                iArr24[lIllllllll[0]] = lIllllllll[23];
                if (lIlIIIIlllIIl(Bank.contains(iArr24) ? 1 : 0)) {
                    bv.add(new C0017d(lIllllllll[23], lIllllllll[68], lIllllllll[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIllllllll[1]];
        iArr25[lIllllllll[0]] = lIllllllll[20];
        if (lIlIIIIlllIIl(Bank.contains(iArr25) ? 1 : 0)) {
            bv.add(new C0017d(lIllllllll[20], lIllllllll[69], lIllllllll[40]));
            "".length();
        }
        if (lIlIIIIlllIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllllllI[lIllllllll[75]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(lIllllllll[70], lIllllllll[19], lIllllllll[71]));
            "".length();
        }
        int[] iArr26 = new int[lIllllllll[1]];
        iArr26[lIllllllll[0]] = lIllllllll[72];
        if (lIlIIIIlllIIl(Bank.contains(iArr26) ? 1 : 0)) {
            bv.add(new C0017d(lIllllllll[72], lIllllllll[33], lIllllllll[73]));
            "".length();
        }
        int[] iArr27 = new int[lIllllllll[1]];
        iArr27[lIllllllll[0]] = lIllllllll[18];
        if (lIlIIIIlllIIl(Bank.contains(iArr27) ? 1 : 0)) {
            bv.add(new C0017d(lIllllllll[18], lIllllllll[33], lIllllllll[73]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lIllllllll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        lIlIIIIllIllI();
        lIlIIIIllIlIl();
        ci = lIllllllll[0];
        bv = new ArrayList();
        cj = new WorldArea(lIllllllll[77], lIllllllll[78], lIllllllll[53], lIllllllll[43], lIllllllll[0]);
        ck = new WorldPoint(lIllllllll[79], lIllllllll[80], lIllllllll[0]);
        cl = null;
    }

    private static boolean lIlIIIIllllII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlIIIIllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0207, code lost:
        if (lIlIIIIllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x029e, code lost:
        if (lIlIIIIllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0380, code lost:
        if (lIlIIIIllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ao() {
        if (lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[21])) {
            int[] iArr = new int[lIllllllll[1]];
            iArr[lIllllllll[0]] = lIllllllll[9];
            if (lIlIIIIllIlll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllllllll[1]];
                iArr2[lIllllllll[0]] = lIllllllll[13];
                if (lIlIIIIllIlll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIllllllll[1]];
                    iArr3[lIllllllll[0]] = lIllllllll[11];
                    if (lIlIIIIllIlll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIllllllll[1]];
                        iArr4[lIllllllll[0]] = lIllllllll[14];
                        if (lIlIIIIllIlll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIllllllll[1]];
                            iArr5[lIllllllll[0]] = lIllllllll[20];
                            if (lIlIIIIllIlll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIllllllll[1]];
                                iArr6[lIllllllll[0]] = lIllllllll[48];
                                if (lIlIIIIlllIIl(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIllllllll[1]];
                                    iArr7[lIllllllll[0]] = lIllllllll[48];
                                }
                                ?? r0 = lIllllllll[1];
                                "".length();
                                return (((88 ^ 78) ^ (4 ^ 28)) & (((93 ^ 30) ^ (64 ^ 13)) ^ (-" ".length()))) == (-" ".length()) ? ((68 ^ 36) ^ (73 ^ 119)) & (((7 ^ 68) ^ (170 ^ 183)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIllllllll[0];
        } else if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[21]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[8])) {
            int[] iArr8 = new int[lIllllllll[1]];
            iArr8[lIllllllll[0]] = lIllllllll[13];
            if (lIlIIIIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIllllllll[1]];
                iArr9[lIllllllll[0]] = lIllllllll[11];
                if (lIlIIIIllIlll(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIllllllll[1]];
                    iArr10[lIllllllll[0]] = lIllllllll[14];
                    if (lIlIIIIllIlll(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIllllllll[1]];
                        iArr11[lIllllllll[0]] = lIllllllll[16];
                        if (lIlIIIIllIlll(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIllllllll[1]];
                            iArr12[lIllllllll[0]] = lIllllllll[48];
                            if (lIlIIIIlllIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIllllllll[1]];
                                iArr13[lIllllllll[0]] = lIllllllll[48];
                            }
                            ?? r02 = lIllllllll[1];
                            "".length();
                            return "   ".length() == "  ".length() ? ((44 ^ 63) ^ (153 ^ 167)) & (((97 ^ 11) ^ (93 ^ 26)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIllllllll[0];
        } else if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[8]) && lIlIIIIlllIIl(ci ? 1 : 0)) {
            int[] iArr14 = new int[lIllllllll[1]];
            iArr14[lIllllllll[0]] = lIllllllll[22];
            if (lIlIIIIlllIIl(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIllllllll[1]];
                iArr15[lIllllllll[0]] = lIllllllll[22];
            }
            int[] iArr16 = new int[lIllllllll[1]];
            iArr16[lIllllllll[0]] = lIllllllll[24];
            if (lIlIIIIllIlll(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIllllllll[1]];
                iArr17[lIllllllll[0]] = lIllllllll[25];
                if (lIlIIIIllIlll(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIllllllll[1];
                    "".length();
                    return ((23 ^ 96) ^ (24 ^ 107)) <= "  ".length() ? ((106 ^ 17) ^ (93 ^ 53)) & (((((128 + 65) - 138) + 74) ^ (((45 + 78) - 12) + 35)) ^ (-" ".length())) : r03;
                }
            }
            return lIllllllll[0];
        } else if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[8]) && lIlIIIIllIlll(ci ? 1 : 0)) {
            int[] iArr18 = new int[lIllllllll[1]];
            iArr18[lIllllllll[0]] = lIllllllll[22];
            if (lIlIIIIlllIIl(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIllllllll[1]];
                iArr19[lIllllllll[0]] = lIllllllll[22];
            }
            int[] iArr20 = new int[lIllllllll[1]];
            iArr20[lIllllllll[0]] = lIllllllll[16];
            if (lIlIIIIllIlll(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIllllllll[1]];
                iArr21[lIllllllll[0]] = lIllllllll[23];
                if (lIlIIIIllIlll(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIllllllll[1]];
                    iArr22[lIllllllll[0]] = lIllllllll[23];
                    if (lIlIIIIllllII(Bank.getFirst(iArr22).getQuantity(), lIllllllll[19])) {
                        int[] iArr23 = new int[lIllllllll[1]];
                        iArr23[lIllllllll[0]] = lIllllllll[24];
                        if (lIlIIIIllIlll(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIllllllll[1]];
                            iArr24[lIllllllll[0]] = lIllllllll[25];
                            if (lIlIIIIllIlll(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIllllllll[1];
                                "".length();
                                return " ".length() != " ".length() ? "   ".length() & ("   ".length() ^ (-1)) : r04;
                            }
                        }
                    }
                }
            }
            return lIllllllll[0];
        } else {
            return lIllllllll[0];
        }
    }

    public static void al() {
        if (lIlIIIIllIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIIIlllIIl(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lIlllllllI[lIllllllll[43]];
            Movement.walkTo(ck);
            "".length();
            Time.sleepTicks(lIllllllll[1]);
            "".length();
        }
        if (lIlIIIIllIlll(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lIlllllllI[lIllllllll[44]];
            am();
        }
    }

    private static boolean lIlIIIIllIlll(int i) {
        return i != 0;
    }

    private static boolean lIlIIIlIIIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIIlIIIIII(int i) {
        return i < 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lIlllllllI[lIllllllll[74]];
    }

    private static void lIlIIIIllIllI() {
        lIllllllll = new int[82];
        lIllllllll[0] = ((177 ^ 164) ^ (88 ^ 10)) & (((210 ^ 177) ^ (125 ^ 89)) ^ (-" ".length()));
        lIllllllll[1] = " ".length();
        lIllllllll[2] = (231 ^ 186) ^ (66 ^ 84);
        lIllllllll[3] = "  ".length();
        lIllllllll[4] = "   ".length();
        lIllllllll[5] = (-((-21507) & 29798)) & (-16389) & 29679;
        lIllllllll[6] = (((98 + 14) - (-11)) + 29) ^ (((31 + 28) - (-34)) + 65);
        lIllllllll[7] = (159 ^ 170) ^ (84 ^ 101);
        lIllllllll[8] = (2 ^ 33) ^ (65 ^ 85);
        lIllllllll[9] = (-9602) & 10159;
        lIllllllll[10] = (-28707) & 30206;
        lIllllllll[11] = (-((-31499) & 32607)) & (-12673) & 14335;
        lIllllllll[12] = (-((-4437) & 29567)) & (-17) & 27646;
        lIllllllll[13] = (-12305) & 12861;
        lIllllllll[14] = (-((-1721) & 24509)) & (-194) & 23535;
        lIllllllll[15] = (-((-5413) & 30063)) & (-1026) & 30175;
        lIllllllll[16] = (-((-16385) & 32069)) & (-16513) & 32759;
        lIllllllll[17] = (-555) & 13179;
        lIllllllll[18] = (-((-16835) & 25079)) & (-16385) & 32637;
        lIllllllll[19] = 86 ^ 83;
        lIllllllll[20] = (-12417) & 12795;
        lIllllllll[21] = 28 ^ 5;
        lIllllllll[22] = (-28689) & 30075;
        lIllllllll[23] = (-32002) & 32557;
        lIllllllll[24] = (-18695) & 19255;
        lIllllllll[25] = (((37 + 104) - 24) + 44) ^ (((15 + 29) - (-6)) + 109);
        lIllllllll[26] = (((163 + 111) - 137) + 52) ^ (((157 + 10) - 92) + 87);
        lIllllllll[27] = 169 ^ 174;
        lIllllllll[28] = -" ".length();
        lIllllllll[29] = 95 ^ 122;
        lIllllllll[30] = 204 ^ 196;
        lIllllllll[31] = (22 ^ 37) ^ (14 ^ 16);
        lIllllllll[32] = 155 ^ 146;
        lIllllllll[33] = 14 ^ 4;
        lIllllllll[34] = (113 ^ 86) ^ (45 ^ 1);
        lIllllllll[35] = (-25349) & 28510;
        lIllllllll[36] = (-((-3593) & 15945)) & (-16417) & 32255;
        lIllllllll[37] = 12 ^ 0;
        lIllllllll[38] = (100 ^ 90) ^ " ".length();
        lIllllllll[39] = (75 ^ 2) ^ (22 ^ 82);
        lIllllllll[40] = (-((-4169) & 22783)) & (-8713) & 27646;
        lIllllllll[41] = (-24014) & 24543;
        lIllllllll[42] = (-12802) & 16301;
        lIllllllll[43] = 175 ^ 161;
        lIllllllll[44] = (82 ^ 20) ^ (217 ^ 144);
        lIllllllll[45] = (73 ^ 49) ^ (44 ^ 68);
        lIllllllll[46] = 175 ^ 190;
        lIllllllll[47] = 25 ^ 11;
        lIllllllll[48] = (-((-3393) & 24513)) & (-19) & 22519;
        lIllllllll[49] = 6 ^ 21;
        lIllllllll[50] = (-((-9239) & 13375)) & (-17537) & 21948;
        lIllllllll[51] = (-8359) & 8951;
        lIllllllll[52] = (251 ^ 176) ^ (228 ^ 181);
        lIllllllll[53] = 53 ^ 33;
        lIllllllll[54] = 0 ^ 21;
        lIllllllll[55] = ((97 + 24) - (-33)) + 47;
        lIllllllll[56] = (((113 + 41) - 18) + 23) ^ (((131 + 50) - 130) + 86);
        lIllllllll[57] = 118 ^ 97;
        lIllllllll[58] = (63 ^ 18) ^ (120 ^ 77);
        lIllllllll[59] = (-1026) & 2025;
        lIllllllll[60] = (((36 ^ 58) + (((21 + 32) - (-11)) + 65)) - (57 ^ 86)) + (121 ^ 3);
        lIllllllll[61] = (-12362) & 16361;
        lIllllllll[62] = (-18448) & 20447;
        lIllllllll[63] = (-((-17139) & 30455)) & (-65) & 16380;
        lIllllllll[64] = (-3075) & 15574;
        lIllllllll[65] = (-((-8390) & 24823)) & (-769) & 32701;
        lIllllllll[66] = 190 ^ 198;
        lIllllllll[67] = ((135 + 105) - 191) + 101;
        lIllllllll[68] = (-1348) & 16347;
        lIllllllll[69] = 238 ^ 138;
        lIllllllll[70] = (-4403) & 16382;
        lIllllllll[71] = (-((-10537) & 16173)) & (-2131) & 32766;
        lIllllllll[72] = (-16521) & 24527;
        lIllllllll[73] = (-23620) & 24519;
        lIllllllll[74] = 140 ^ 151;
        lIllllllll[75] = (18 ^ 122) ^ (178 ^ 198);
        lIllllllll[76] = (((98 + 46) - 78) + 108) ^ (((28 + 63) - 35) + 123);
        lIllllllll[77] = (-8193) & 11214;
        lIllllllll[78] = (-((-23657) & 31869)) & (-20993) & 32503;
        lIllllllll[79] = (-1033) & 4063;
        lIllllllll[80] = (-535) & 3839;
        lIllllllll[81] = 161 ^ 191;
    }

    private static boolean lIlIIIIlllIll(int i) {
        return i > 0;
    }

    private static String lIlIIIIllIIlI(String llllllllllllllllllIllIllIllllIII, String llllllllllllllllllIllIllIlllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIllIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllIllIllllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllIllIllllIlI.init(lIllllllll[3], secretKeySpec);
            return new String(llllllllllllllllllIllIllIllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIllIllllIIl) {
            llllllllllllllllllIllIllIllllIIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIllIlII(String llllllllllllllllllIllIlllIIIllIl, String llllllllllllllllllIllIlllIIIllII) {
        String llllllllllllllllllIllIlllIIIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllllllIllIlllIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllIlllIIIlIll = new StringBuilder();
        char[] charArray = llllllllllllllllllIllIlllIIIllII.toCharArray();
        int llllllllllllllllllIllIlllIIIlIIl = lIllllllll[0];
        char[] charArray2 = llllllllllllllllllIllIlllIIIllIl2.toCharArray();
        int length = charArray2.length;
        int i = lIllllllll[0];
        while (lIlIIIIlllIII(i, length)) {
            char llllllllllllllllllIllIlllIIIlllI = charArray2[i];
            llllllllllllllllllIllIlllIIIlIll.append((char) (llllllllllllllllllIllIlllIIIlllI ^ charArray[llllllllllllllllllIllIlllIIIlIIl % charArray.length]));
            "".length();
            llllllllllllllllllIllIlllIIIlIIl++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIllIlllIIIlIll);
    }

    private static boolean lIlIIIIlllIII(int i, int i2) {
        return i < i2;
    }

    private static int lIlIIIIllllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlIIIIllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e5, code lost:
        if (lIlIIIIllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026a, code lost:
        if (lIlIIIIllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0322, code lost:
        if (lIlIIIIllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        if (lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[21])) {
            int[] iArr = new int[lIllllllll[1]];
            iArr[lIllllllll[0]] = lIllllllll[9];
            if (lIlIIIIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllllllll[1]];
                iArr2[lIllllllll[0]] = lIllllllll[13];
                if (lIlIIIIllIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIllllllll[1]];
                    iArr3[lIllllllll[0]] = lIllllllll[11];
                    if (lIlIIIIllIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIllllllll[1]];
                        iArr4[lIllllllll[0]] = lIllllllll[14];
                        if (lIlIIIIllIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIllllllll[1]];
                            iArr5[lIllllllll[0]] = lIllllllll[20];
                            if (lIlIIIIllIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIllllllll[1]];
                                iArr6[lIllllllll[0]] = lIllllllll[48];
                                if (lIlIIIIlllIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIllllllll[1]];
                                    iArr7[lIllllllll[0]] = lIllllllll[48];
                                }
                                ?? r0 = lIllllllll[1];
                                "".length();
                                return 0 != 0 ? ((225 ^ 157) ^ (192 ^ 182)) & (((119 ^ 20) ^ (78 ^ 39)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIllllllll[0];
        } else if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[21]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[8])) {
            int[] iArr8 = new int[lIllllllll[1]];
            iArr8[lIllllllll[0]] = lIllllllll[13];
            if (lIlIIIIllIlll(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIllllllll[1]];
                iArr9[lIllllllll[0]] = lIllllllll[11];
                if (lIlIIIIllIlll(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIllllllll[1]];
                    iArr10[lIllllllll[0]] = lIllllllll[14];
                    if (lIlIIIIllIlll(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIllllllll[1]];
                        iArr11[lIllllllll[0]] = lIllllllll[16];
                        if (lIlIIIIllIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIllllllll[1]];
                            iArr12[lIllllllll[0]] = lIllllllll[48];
                            if (lIlIIIIlllIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIllllllll[1]];
                                iArr13[lIllllllll[0]] = lIllllllll[48];
                            }
                            ?? r02 = lIllllllll[1];
                            "".length();
                            return " ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIllllllll[0];
        } else if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[8]) && lIlIIIIlllIIl(ci ? 1 : 0)) {
            int[] iArr14 = new int[lIllllllll[1]];
            iArr14[lIllllllll[0]] = lIllllllll[22];
            if (lIlIIIIlllIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIllllllll[1]];
                iArr15[lIllllllll[0]] = lIllllllll[22];
            }
            int[] iArr16 = new int[lIllllllll[1]];
            iArr16[lIllllllll[0]] = lIllllllll[24];
            if (lIlIIIIllIlll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIllllllll[1]];
                iArr17[lIllllllll[0]] = lIllllllll[38];
                if (lIlIIIIllIlll(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIllllllll[1];
                    "".length();
                    return (-(7 ^ 2)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIllllllll[0];
        } else if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[8]) && lIlIIIIllIlll(ci ? 1 : 0)) {
            int[] iArr18 = new int[lIllllllll[1]];
            iArr18[lIllllllll[0]] = lIllllllll[22];
            if (lIlIIIIlllIIl(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIllllllll[1]];
                iArr19[lIllllllll[0]] = lIllllllll[22];
            }
            int[] iArr20 = new int[lIllllllll[1]];
            iArr20[lIllllllll[0]] = lIllllllll[16];
            if (lIlIIIIllIlll(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIllllllll[1]];
                iArr21[lIllllllll[0]] = lIllllllll[23];
                if (lIlIIIIllIlll(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIllllllll[1]];
                    iArr22[lIllllllll[0]] = lIllllllll[23];
                    if (lIlIIIIllllII(Inventory.getFirst(iArr22).getQuantity(), lIllllllll[19])) {
                        int[] iArr23 = new int[lIllllllll[1]];
                        iArr23[lIllllllll[0]] = lIllllllll[24];
                        if (lIlIIIIllIlll(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIllllllll[1]];
                            iArr24[lIllllllll[0]] = lIllllllll[38];
                            if (lIlIIIIllIlll(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIllllllll[1];
                                "".length();
                                return 0 != 0 ? ((36 ^ 121) ^ (243 ^ 129)) & (((((123 + 101) - 194) + 133) ^ (((110 + 77) - 115) + 68)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIllllllll[0];
        } else {
            return lIllllllll[0];
        }
    }

    private static boolean lIlIIIlIIIIlI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ap() {
        if (lIlIIIIllllIl(Vars.getBit(lIllllllll[50]), lIllllllll[1]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[19])) {
            return lIllllllll[1];
        }
        if (lIlIIIIllllIl(Vars.getBit(lIllllllll[50]), lIllllllll[3]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[32]) && lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[19])) {
            return lIllllllll[1];
        }
        if (lIlIIIIllllIl(Vars.getBit(lIllllllll[50]), lIllllllll[4]) && lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[32]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[39])) {
            return lIllllllll[1];
        }
        if (lIlIIIIllllIl(Vars.getBit(lIllllllll[50]), lIllllllll[4]) && lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[32])) {
            int[] iArr = new int[lIllllllll[1]];
            iArr[lIllllllll[0]] = lIllllllll[14];
            if (lIlIIIIlllIIl(Inventory.contains(iArr) ? 1 : 0)) {
                return lIllllllll[1];
            }
        }
        if (lIlIIIIllllIl(Vars.getBit(lIllllllll[50]), lIllllllll[7]) && lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[39])) {
            int[] iArr2 = new int[lIllllllll[1]];
            iArr2[lIllllllll[0]] = lIllllllll[14];
            if (lIlIIIIllIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIllllllll[1];
            }
        }
        return lIllllllll[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            ak();
            "".length();
            if ("  ".length() == " ".length()) {
                return (240 ^ 167) & ((108 ^ 59) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllllllll[69];
    }

    private static boolean lIlIIIIlllllI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIIlllIIl(int i) {
        return i == 0;
    }

    private static boolean lIlIIIIllllIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[2])) {
            ?? r0 = lIllllllll[1];
            "".length();
            return (((42 ^ 101) ^ (46 ^ 103)) & (((74 ^ 88) ^ (16 ^ 4)) ^ (-" ".length()))) > ((((111 + 14) - 65) + 94) ^ (((79 + 50) - 80) + 109)) ? ((((188 + 50) - 53) + 4) ^ (((56 + 83) - 86) + 83)) & (((((123 + 82) - 154) + 129) ^ (((81 + 51) - 90) + 87)) ^ (-" ".length())) : r0;
        }
        return lIllllllll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v368, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v401, types: [boolean] */
    public static void ak() {
        if (lIlIIIIllIlll(bt ? 1 : 0)) {
            AccBuilderSotf.c = lIlllllllI[lIllllllll[0]];
            C0015b.a(bv);
            if (lIlIIIIlllIII(bv.size(), lIllllllll[1])) {
                System.out.println(lIlllllllI[lIllllllll[1]]);
                bt = lIllllllll[0];
            }
        }
        if (lIlIIIIlllIIl(bt ? 1 : 0) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[2])) {
            if (lIlIIIIlllIIl(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIIlllIlI(nearest) && lIlIIIIlllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[3]];
                    C0000a.a(nearest);
                }
                if (lIlIIIIlllIlI(nearest) && lIlIIIIllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[4]];
                    if (lIlIIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllllllll[5]);
                        "".length();
                        Time.sleepTicks(lIllllllll[6]);
                        "".length();
                    }
                    if (lIlIIIIllIlll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIIIlllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllllllll[7]);
                            "".length();
                        }
                        while (lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[8]) && lIlIIIIlllIIl(I.co() ? 1 : 0)) {
                            I.cm();
                            Time.sleepTicks(lIllllllll[1]);
                            "".length();
                            "".length();
                            if ("  ".length() <= 0) {
                                return;
                            }
                        }
                        if (lIlIIIIlllIIl(ao() ? 1 : 0)) {
                            Q();
                            System.out.println(lIlllllllI[lIllllllll[7]]);
                            bt = lIllllllll[1];
                            return;
                        }
                        if (lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[8])) {
                            int[] iArr = new int[lIllllllll[1]];
                            iArr[lIllllllll[0]] = lIllllllll[9];
                            if (lIlIIIIllIlll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIllllllll[1]];
                                iArr2[lIllllllll[0]] = lIllllllll[9];
                                if (lIlIIIIlllIII(Inventory.getCount(iArr2), lIllllllll[1])) {
                                    Bank.withdraw(lIllllllll[9], lIllllllll[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIllllllll[1]];
                                        iArr3[lIllllllll[0]] = lIllllllll[9];
                                        if (lIlIIIIlllIll(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIllllllll[1];
                                            "".length();
                                            return (((((107 + 126) - 42) + 44) ^ (((10 + 98) - 29) + 92)) & (((46 ^ 41) ^ (65 ^ 6)) ^ (-" ".length()))) <= (-" ".length()) ? ((137 ^ 172) ^ (70 ^ 117)) & (((10 ^ 83) ^ (63 ^ 112)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllllll[0];
                                    }, lIllllllll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIllllllll[1]];
                            iArr3[lIllllllll[0]] = lIllllllll[11];
                            if (lIlIIIIllIlll(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIllllllll[1]];
                                iArr4[lIllllllll[0]] = lIllllllll[11];
                                if (lIlIIIIlllIII(Inventory.getCount(iArr4), lIllllllll[1])) {
                                    Bank.withdraw(lIllllllll[11], lIllllllll[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIllllllll[1]];
                                        iArr5[lIllllllll[0]] = lIllllllll[11];
                                        if (lIlIIIIlllIll(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIllllllll[1];
                                            "".length();
                                            return ("  ".length() & ("  ".length() ^ (-" ".length()))) != 0 ? ((((15 + 63) - (-76)) + 28) ^ (((96 + 184) - 147) + 54)) & (((31 ^ 14) ^ (115 ^ 111)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllllll[0];
                                    }, lIllllllll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIllllllll[1]];
                            iArr5[lIllllllll[0]] = lIllllllll[13];
                            if (lIlIIIIllIlll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIllllllll[1]];
                                iArr6[lIllllllll[0]] = lIllllllll[13];
                                if (lIlIIIIlllIII(Inventory.getCount(iArr6), lIllllllll[1])) {
                                    Bank.withdraw(lIllllllll[13], lIllllllll[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIllllllll[1]];
                                        iArr7[lIllllllll[0]] = lIllllllll[13];
                                        if (lIlIIIIlllIll(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIllllllll[1];
                                            "".length();
                                            return (-" ".length()) == ((91 ^ 47) ^ (45 ^ 93)) ? ((108 ^ 61) ^ (235 ^ 188)) & (((((115 + 108) - 115) + 34) ^ (((131 + 76) - 148) + 77)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllllll[0];
                                    }, lIllllllll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIllllllll[1]];
                            iArr7[lIllllllll[0]] = lIllllllll[14];
                            if (lIlIIIIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIllllllll[1]];
                                iArr8[lIllllllll[0]] = lIllllllll[14];
                                if (lIlIIIIlllIII(Inventory.getCount(iArr8), lIllllllll[1])) {
                                    Bank.withdraw(lIllllllll[14], lIllllllll[15], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIllllllll[1]];
                                        iArr9[lIllllllll[0]] = lIllllllll[14];
                                        if (lIlIIIIlllIll(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIllllllll[1];
                                            "".length();
                                            return 0 != 0 ? ((66 ^ 107) ^ (181 ^ 184)) & (((((111 + 81) - 167) + 155) ^ (((98 + 110) - 97) + 33)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllllll[0];
                                    }, lIllllllll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIllllllll[1]];
                            iArr9[lIllllllll[0]] = lIllllllll[16];
                            if (lIlIIIIllIlll(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIllllllll[1]];
                                iArr10[lIllllllll[0]] = lIllllllll[16];
                                if (lIlIIIIlllIII(Inventory.getCount(iArr10), lIllllllll[1])) {
                                    Bank.withdraw(lIllllllll[16], lIllllllll[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIllllllll[1]];
                                        iArr11[lIllllllll[0]] = lIllllllll[16];
                                        if (lIlIIIIlllIll(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIllllllll[1];
                                            "".length();
                                            return "   ".length() < (-" ".length()) ? ((((54 + 41) - 91) + 143) ^ (((188 + 95) - 216) + 127)) & (((((29 + 15) - (-105)) + 86) ^ (((74 + 11) - (-97)) + 4)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllllll[0];
                                    }, lIllllllll[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIllllllll[1]];
                            iArr11[lIllllllll[0]] = lIllllllll[17];
                            if (lIlIIIIllIlll(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIllllllll[1]];
                                iArr12[lIllllllll[0]] = lIllllllll[17];
                                if (lIlIIIIlllIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIllllllll[17], lIllllllll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIllllllll[1]];
                                        iArr13[lIllllllll[0]] = lIllllllll[17];
                                        return Inventory.contains(iArr13);
                                    }, lIllllllll[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIllllllll[18], lIllllllll[19], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIllllllll[1]];
                            iArr13[lIllllllll[0]] = lIllllllll[20];
                            if (lIlIIIIllIlll(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIllllllll[1]];
                                iArr14[lIllllllll[0]] = lIllllllll[20];
                                if (lIlIIIIlllIII(Inventory.getCount(iArr14), lIllllllll[1]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[21])) {
                                    Bank.withdrawAll(lIllllllll[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIllllllll[1]];
                                        iArr15[lIllllllll[0]] = lIllllllll[20];
                                        if (lIlIIIIlllIll(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIllllllll[1];
                                            "".length();
                                            return (((183 ^ 130) ^ (234 ^ 146)) & (((111 ^ 54) ^ (62 ^ 42)) ^ (-" ".length()))) > 0 ? ((244 ^ 144) ^ (30 ^ 91)) & (((((128 + 40) - 137) + 126) ^ (((105 + 111) - 43) + 15)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllllll[0];
                                    }, lIllllllll[5]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[8])) {
                            int[] iArr15 = new int[lIllllllll[1]];
                            iArr15[lIllllllll[0]] = lIllllllll[22];
                            if (lIlIIIIlllIIl(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIllllllll[22], lIllllllll[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIllllllll[1]);
                                "".length();
                            }
                            if (lIlIIIIllIlll(ci ? 1 : 0)) {
                                Bank.withdrawAll(lIllllllll[23], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIllllllll[1]);
                                "".length();
                                Bank.withdrawAll(lIllllllll[16], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIllllllll[1]);
                                "".length();
                            }
                            Time.sleepTicks(lIllllllll[4]);
                            "".length();
                            Bank.withdrawAll(lIllllllll[24], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIllllllll[1]);
                            "".length();
                            Bank.withdrawAll(lIllllllll[25], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIllllllll[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIIIIllIlll(an() ? 1 : 0)) {
                if (lIlIIIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[21])) {
                    if (lIlIIIIlllIIl(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllllI[lIllllllll[19]];
                        Movement.walkTo(ck);
                        "".length();
                        Time.sleepTicks(lIllllllll[1]);
                        "".length();
                    }
                    if (lIlIIIIllIlll(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllllI[lIllllllll[6]];
                        am();
                    }
                }
                if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[21]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[26])) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[27]];
                    if (lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIllllllll[1]);
                        "".length();
                    }
                }
                if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[26]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[29])) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[30]];
                    if (lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIllllllll[1]);
                        "".length();
                    }
                }
                if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[29]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[31])) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[32]];
                    if (lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIllllllll[1]);
                        "".length();
                    }
                }
                if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[31]) && lIlIIIIlllIII(Skills.getLevel(Skill.MAGIC), lIllllllll[8])) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[33]];
                    if (lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIllllllll[1]);
                        "".length();
                    }
                }
                if (lIlIIIIllllII(Skills.getLevel(Skill.MAGIC), lIllllllll[8])) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[34]];
                    if (lIlIIIIlllllI(cl)) {
                        cl = new WorldPoint(lIllllllll[35] + C0018e.c(lIllllllll[1], lIllllllll[7]), lIllllllll[36], lIllllllll[0]);
                    }
                    int[] iArr16 = new int[lIllllllll[1]];
                    iArr16[lIllllllll[0]] = lIllllllll[22];
                    if (lIlIIIIllIlll(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIllllllll[1]];
                        iArr17[lIllllllll[0]] = lIllllllll[22];
                        if (lIlIIIIlllIIl(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIllllllll[1]];
                            iArr18[lIllllllll[0]] = lIllllllll[22];
                            Inventory.getFirst(iArr18).interact(lIlllllllI[lIllllllll[37]]);
                            Time.sleepTicks(lIllllllll[1]);
                            "".length();
                        }
                    }
                    if (lIlIIIIllIlll(GrandExchange.isOpen() ? 1 : 0)) {
                        C0015b.g();
                    }
                    int[] iArr19 = new int[lIllllllll[1]];
                    iArr19[lIllllllll[0]] = lIllllllll[24];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIllllllll[1]];
                    iArr20[lIllllllll[0]] = lIllllllll[38];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIlIIIIlllIIl(ci ? 1 : 0) && lIlIIIIlllIlI(cl)) {
                        if (lIlIIIIlllIIl(Players.getLocal().getWorldLocation().equals(cl) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllllllI[lIllllllll[39]];
                            Movement.walkTo(cl);
                            "".length();
                            Time.sleepTicks(lIllllllll[1]);
                            "".length();
                        }
                        if (lIlIIIIllIlll(Players.getLocal().getWorldLocation().equals(cl) ? 1 : 0) && lIlIIIIlllIlI(first) && lIlIIIIlllIlI(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlIIIlIIIIlI(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIllllllll[1];
                                    "".length();
                                    return (((((91 + 69) - 2) + 32) ^ (((52 + 46) - (-15)) + 23)) & (((((90 + 79) - 136) + 142) ^ (((24 + 82) - (-12)) + 35)) ^ (-" ".length()))) != 0 ? ((87 ^ 105) ^ (6 ^ 101)) & (((80 ^ 111) ^ (12 ^ 110)) ^ (-" ".length())) : r0;
                                }
                                return lIllllllll[0];
                            }, lIllllllll[10]);
                            "".length();
                            Time.sleep(C0018e.c(lIllllllll[40], lIllllllll[41]));
                            "".length();
                        }
                    }
                    if (lIlIIIIllIlll(ci ? 1 : 0)) {
                        if (lIlIIIIlllIlI(first) && lIlIIIIlllIlI(first2) && lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlIIIlIIIIlI(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIllllllll[1];
                                    "".length();
                                    return "   ".length() == 0 ? ((20 ^ 55) ^ (141 ^ 178)) & (((97 ^ 13) ^ (26 ^ 106)) ^ (-" ".length())) : r0;
                                }
                                return lIllllllll[0];
                            }, lIllllllll[10]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                                ?? r0 = lIllllllll[1];
                                "".length();
                                return (145 ^ 149) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllllllll[0];
                        }, lIllllllll[42]);
                        "".length();
                    }
                }
            }
        }
    }
}
