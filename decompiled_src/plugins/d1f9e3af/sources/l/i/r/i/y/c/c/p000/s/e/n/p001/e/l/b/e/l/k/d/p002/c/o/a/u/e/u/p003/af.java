package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.af  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/af.class */
public class af implements W {
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ String[] lIIllllII;
    private static /* synthetic */ int[] lIIllllIl;

    static {
        lIIIIlIIIIIl();
        lIIIIlIIIIII();
        bv = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0121, code lost:
        if (lIIIIlIIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.af.lIIllllIl[47]) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04b9, code lost:
        if (lIIIIlIIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.af.lIIllllIl[25]) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0502  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        if (lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[28])) {
            int[] iArr2 = new int[lIIllllIl[1]];
            iArr2[lIIllllIl[0]] = lIIllllIl[13];
            if (lIIIIlIIIlII(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIllllIl[13], lIIllllIl[1], lIIllllIl[46]));
                "".length();
            }
            int[] iArr3 = new int[lIIllllIl[1]];
            iArr3[lIIllllIl[0]] = lIIllllIl[14];
            if (lIIIIlIIIlII(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIIllllIl[14], lIIllllIl[1], lIIllllIl[46]));
                "".length();
            }
            int[] iArr4 = new int[lIIllllIl[1]];
            iArr4[lIIllllIl[0]] = lIIllllIl[15];
            if (lIIIIlIIIlII(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIIllllIl[15], lIIllllIl[1], lIIllllIl[46]));
                "".length();
            }
            int[] iArr5 = new int[lIIllllIl[1]];
            iArr5[lIIllllIl[0]] = lIIllllIl[16];
            if (lIIIIlIIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIllllIl[1]];
                iArr6[lIIllllIl[0]] = lIIllllIl[16];
            }
            bv.add(new C0003d(lIIllllIl[16], lIIllllIl[48], lIIllllIl[35]));
            "".length();
        }
        int[] iArr7 = new int[lIIllllIl[1]];
        iArr7[lIIllllIl[0]] = lIIllllIl[19];
        if (lIIIIlIIIlII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIl[19], lIIllllIl[1], lIIllllIl[49]));
            "".length();
        }
        int[] iArr8 = new int[lIIllllIl[1]];
        iArr8[lIIllllIl[0]] = lIIllllIl[20];
        if (lIIIIlIIIlII(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIl[20], lIIllllIl[1], lIIllllIl[49]));
            "".length();
        }
        int[] iArr9 = new int[lIIllllIl[1]];
        iArr9[lIIllllIl[0]] = lIIllllIl[18];
        if (lIIIIlIIIlII(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIl[18], lIIllllIl[1], lIIllllIl[49]));
            "".length();
        }
        int[] iArr10 = new int[lIIllllIl[1]];
        iArr10[lIIllllIl[0]] = lIIllllIl[21];
        if (lIIIIlIIIlII(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIl[21], lIIllllIl[1], lIIllllIl[50]));
            "".length();
        }
        if (lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[8])) {
            int[] iArr11 = new int[lIIllllIl[1]];
            iArr11[lIIllllIl[0]] = lIIllllIl[17];
            if (lIIIIlIIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                bv.add(new C0003d(lIIllllIl[17], lIIllllIl[51], lIIllllIl[42]));
                "".length();
            }
        }
        int[] iArr12 = new int[lIIllllIl[1]];
        iArr12[lIIllllIl[0]] = lIIllllIl[10];
        if (lIIIIlIIIlII(Bank.contains(iArr12) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIl[10], lIIllllIl[1], lIIllllIl[52]));
            "".length();
        }
        int[] iArr13 = new int[lIIllllIl[1]];
        iArr13[lIIllllIl[0]] = lIIllllIl[11];
        if (lIIIIlIIIlII(Bank.contains(iArr13) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIl[11], lIIllllIl[1], lIIllllIl[52]));
            "".length();
        }
        if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[8])) {
            int[] iArr14 = new int[lIIllllIl[1]];
            iArr14[lIIllllIl[0]] = lIIllllIl[12];
            if (lIIIIlIIIlII(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0003d(lIIllllIl[12], lIIllllIl[48], lIIllllIl[53]));
                "".length();
            }
        }
        int[] iArr15 = new int[lIIllllIl[1]];
        iArr15[lIIllllIl[0]] = lIIllllIl[23];
        if (lIIIIlIIIlII(Bank.contains(iArr15) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIl[23], lIIllllIl[1], C0008i.bq));
            "".length();
        }
        int[] iArr16 = new int[lIIllllIl[1]];
        iArr16[lIIllllIl[0]] = lIIllllIl[27];
        if (lIIIIlIIIlII(Bank.contains(iArr16) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIl[27], lIIllllIl[54], lIIllllIl[55]));
            "".length();
        }
        if (lIIIIlIIIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIllllII[lIIllllIl[2]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIl[56], lIIllllIl[6], lIIllllIl[57]));
            "".length();
        }
        int[] iArr17 = new int[lIIllllIl[1]];
        iArr17[lIIllllIl[0]] = lIIllllIl[58];
        if (lIIIIlIIIIlI(Bank.contains(iArr17) ? 1 : 0)) {
            int[] iArr18 = new int[lIIllllIl[1]];
            iArr18[lIIllllIl[0]] = lIIllllIl[58];
            if (lIIIIlIIIIlI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIllllIl[1]];
                iArr19[lIIllllIl[0]] = lIIllllIl[58];
            }
            iArr = new int[lIIllllIl[1]];
            iArr[lIIllllIl[0]] = lIIllllIl[24];
            if (lIIIIlIIIIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr20 = new int[lIIllllIl[1]];
                iArr20[lIIllllIl[0]] = lIIllllIl[24];
                if (!lIIIIlIIIIlI(Bank.contains(iArr20) ? 1 : 0)) {
                    return;
                }
                int[] iArr21 = new int[lIIllllIl[1]];
                iArr21[lIIllllIl[0]] = lIIllllIl[24];
                if (!lIIIIlIIIIll(Bank.getFirst(iArr21).getQuantity(), lIIllllIl[25])) {
                    return;
                }
            }
            bv.add(new C0003d(lIIllllIl[24], lIIllllIl[25], lIIllllIl[59]));
            "".length();
        }
        bv.add(new C0003d(lIIllllIl[58], lIIllllIl[25], lIIllllIl[59]));
        "".length();
        iArr = new int[lIIllllIl[1]];
        iArr[lIIllllIl[0]] = lIIllllIl[24];
        if (lIIIIlIIIIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIllllIl[24], lIIllllIl[25], lIIllllIl[59]));
        "".length();
    }

    private static boolean lIIIIlIIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIlIIlIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIIlIIIlII(int i) {
        return i == 0;
    }

    private static void lIIIIlIIIIII() {
        lIIllllII = new String[lIIllllIl[62]];
        lIIllllII[lIIllllIl[0]] = lIIIIIllllIl("IBYVATgFQwUcMw8Q", "bclhV");
        lIIllllII[lIIllllIl[1]] = lIIIIIlllllI("/BBlYX+Hmh9TSbjR4IgvdwKeqtIjYdXh88/sCetRZW0PAYinNStUxNA3X+ms2/peMj/qasMIPX8=", "UyYpO");
        lIIllllII[lIIllllIl[3]] = lIIIIIllllIl("NwATEyMYFQwUI1kVClomGA8O", "yaezD");
        lIIllllII[lIIllllIl[4]] = lIIIIIllllIl("LQ0vKh8MAiZuEQQCKicdAg==", "elANs");
        lIIllllII[lIIllllIl[7]] = lIIIIIllllIl("NiRoJzwEYSUvPRIoJiFuEjQ4NiIIJDtqbhI2ITItCSgmIW4VLmgEGzgIBgE=", "aAHFN");
        lIIllllII[lIIllllIl[6]] = lIIIIIllllll("6bvq788DuY0=", "RQAPc");
        lIIllllII[lIIllllIl[31]] = lIIIIIlllllI("xloW97+jzas=", "AwDyN");
        lIIllllII[lIIllllIl[32]] = lIIIIIllllIl("NicyGQ==", "aBSkO");
        lIIllllII[lIIllllIl[33]] = lIIIIIllllll("R+xnVInoQ0s=", "aMIhb");
        lIIllllII[lIIllllIl[35]] = lIIIIIllllIl("NQIOHy0=", "bkksI");
        lIIllllII[lIIllllIl[25]] = lIIIIIllllll("Tr02o/M8gJE=", "GmKBU");
        lIIllllII[lIIllllIl[37]] = lIIIIIllllIl("HSMvAQ==", "JFNsn");
        lIIllllII[lIIllllIl[38]] = lIIIIIllllIl("HhEFBA==", "ItdvO");
        lIIllllII[lIIllllIl[39]] = lIIIIIllllIl("JQoFKA==", "rodZC");
        lIIllllII[lIIllllIl[40]] = lIIIIIllllll("3imC5iiP3us=", "hUrbC");
        lIIllllII[lIIllllIl[42]] = lIIIIIllllIl("JQEDAw==", "rdbqh");
        lIIllllII[lIIllllIl[43]] = lIIIIIlllllI("oQd/h+4sWik=", "pngaI");
        lIIllllII[lIIllllIl[44]] = lIIIIIllllIl("FQMQEQ==", "Bfqcs");
        lIIllllII[lIIllllIl[45]] = lIIIIIllllIl("FCswBjY=", "CBUjR");
        lIIllllII[lIIllllIl[60]] = lIIIIIllllll("7opfBLedILnetfUDTIv4VA==", "BmjDV");
        lIIllllII[lIIllllIl[2]] = lIIIIIllllll("3tmZfhMCLYW0YB6IPQFl23cjl5eEO9hM", "WMDyF");
        lIIllllII[lIIllllIl[61]] = lIIIIIllllIl("LQci", "OhUZV");
    }

    private static boolean lIIIIlIIIIll(int i, int i2) {
        return i < i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIllllII[lIIllllIl[60]];
    }

    private static boolean lIIIIlIIIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIlIIlIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains((v0) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
            return l(v0);
        }) ? 1 : 0) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void aq() {
        int[] iArr = new int[lIIllllIl[1]];
        iArr[lIIllllIl[0]] = lIIllllIl[29];
        if (lIIIIlIIIlII(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIllllIl[1]];
            iArr2[lIIllllIl[0]] = lIIllllIl[30];
            if (lIIIIlIIIlII(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIllllIl[1]];
                iArr3[lIIllllIl[0]] = lIIllllIl[17];
                if (lIIIIlIIIlII(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIllllIl[1]];
                    iArr4[lIIllllIl[0]] = lIIllllIl[12];
                    if (lIIIIlIIIlII(Equipment.contains(iArr4) ? 1 : 0)) {
                    }
                }
            }
        }
        if (lIIIIlIIlIII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[28])) {
            int[] iArr5 = new int[lIIllllIl[1]];
            iArr5[lIIllllIl[0]] = lIIllllIl[29];
            if (lIIIIlIIIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIllllIl[1]];
                iArr6[lIIllllIl[0]] = lIIllllIl[29];
                Inventory.getFirst(iArr6).interact(lIIllllII[lIIllllIl[31]]);
            }
            int[] iArr7 = new int[lIIllllIl[1]];
            iArr7[lIIllllIl[0]] = lIIllllIl[13];
            if (lIIIIlIIIIlI(Inventory.contains(iArr7) ? 1 : 0) && lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[6])) {
                C0004e.l(lIIllllIl[13]);
            }
            int[] iArr8 = new int[lIIllllIl[1]];
            iArr8[lIIllllIl[0]] = lIIllllIl[14];
            if (lIIIIlIIIIlI(Inventory.contains(iArr8) ? 1 : 0) && lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[6]) && lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[2])) {
                C0004e.l(lIIllllIl[14]);
            }
            int[] iArr9 = new int[lIIllllIl[1]];
            iArr9[lIIllllIl[0]] = lIIllllIl[15];
            if (lIIIIlIIIIlI(Inventory.contains(iArr9) ? 1 : 0) && lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[2])) {
                C0004e.l(lIIllllIl[15]);
            }
            int[] iArr10 = new int[lIIllllIl[1]];
            iArr10[lIIllllIl[0]] = lIIllllIl[16];
            if (lIIIIlIIIIlI(Inventory.contains(iArr10) ? 1 : 0)) {
                C0004e.l(lIIllllIl[16]);
            }
        }
        if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[2])) {
            int[] iArr11 = new int[lIIllllIl[1]];
            iArr11[lIIllllIl[0]] = lIIllllIl[19];
            if (lIIIIlIIIIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIllllIl[1]];
                iArr12[lIIllllIl[0]] = lIIllllIl[19];
                Inventory.getFirst(iArr12).interact(lIIllllII[lIIllllIl[32]]);
            }
        }
        if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[28])) {
            int[] iArr13 = new int[lIIllllIl[1]];
            iArr13[lIIllllIl[0]] = lIIllllIl[30];
            if (lIIIIlIIIIlI(Inventory.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lIIllllIl[1]];
                iArr14[lIIllllIl[0]] = lIIllllIl[30];
                Inventory.getFirst(iArr14).interact(lIIllllII[lIIllllIl[33]]);
            }
            int[] iArr15 = new int[lIIllllIl[1]];
            iArr15[lIIllllIl[0]] = lIIllllIl[34];
            if (lIIIIlIIIIlI(Inventory.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIllllIl[1]];
                iArr16[lIIllllIl[0]] = lIIllllIl[34];
                Inventory.getFirst(iArr16).interact(lIIllllII[lIIllllIl[35]]);
            }
            int[] iArr17 = new int[lIIllllIl[1]];
            iArr17[lIIllllIl[0]] = lIIllllIl[17];
            if (lIIIIlIIIIlI(Inventory.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[lIIllllIl[1]];
                iArr18[lIIllllIl[0]] = lIIllllIl[17];
                Inventory.getFirst(iArr18).interact(lIIllllII[lIIllllIl[25]]);
            }
        }
        if (lIIIIlIIIIll(Skills.getLevel(Skill.DEFENCE), lIIllllIl[36])) {
            int[] iArr19 = new int[lIIllllIl[1]];
            iArr19[lIIllllIl[0]] = lIIllllIl[20];
            if (lIIIIlIIIIlI(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIIllllIl[1]];
                iArr20[lIIllllIl[0]] = lIIllllIl[20];
                Inventory.getFirst(iArr20).interact(lIIllllII[lIIllllIl[37]]);
            }
        }
        if (lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[8])) {
            int[] iArr21 = new int[lIIllllIl[1]];
            iArr21[lIIllllIl[0]] = lIIllllIl[18];
            if (lIIIIlIIIIlI(Inventory.contains(iArr21) ? 1 : 0)) {
                int[] iArr22 = new int[lIIllllIl[1]];
                iArr22[lIIllllIl[0]] = lIIllllIl[18];
                Inventory.getFirst(iArr22).interact(lIIllllII[lIIllllIl[38]]);
            }
        }
        int[] iArr23 = new int[lIIllllIl[1]];
        iArr23[lIIllllIl[0]] = lIIllllIl[21];
        if (lIIIIlIIIIlI(Inventory.contains(iArr23) ? 1 : 0)) {
            int[] iArr24 = new int[lIIllllIl[1]];
            iArr24[lIIllllIl[0]] = lIIllllIl[21];
            Inventory.getFirst(iArr24).interact(lIIllllII[lIIllllIl[39]]);
        }
        int[] iArr25 = new int[lIIllllIl[1]];
        iArr25[lIIllllIl[0]] = lIIllllIl[22];
        if (lIIIIlIIIIlI(Inventory.contains(iArr25) ? 1 : 0)) {
            int[] iArr26 = new int[lIIllllIl[1]];
            iArr26[lIIllllIl[0]] = lIIllllIl[22];
            Inventory.getFirst(iArr26).interact(lIIllllII[lIIllllIl[40]]);
        }
        if (lIIIIlIIlIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIllllIl[41])) {
            int[] iArr27 = new int[lIIllllIl[1]];
            iArr27[lIIllllIl[0]] = lIIllllIl[9];
            if (lIIIIlIIIIlI(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[lIIllllIl[1]];
                iArr28[lIIllllIl[0]] = lIIllllIl[9];
                if (lIIIIlIIIlII(Equipment.contains(iArr28) ? 1 : 0)) {
                    int[] iArr29 = new int[lIIllllIl[1]];
                    iArr29[lIIllllIl[0]] = lIIllllIl[9];
                    Inventory.getFirst(iArr29).interact(lIIllllII[lIIllllIl[42]]);
                }
            }
            if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[8])) {
                int[] iArr30 = new int[lIIllllIl[1]];
                iArr30[lIIllllIl[0]] = lIIllllIl[10];
                if (lIIIIlIIIIlI(Inventory.contains(iArr30) ? 1 : 0)) {
                    int[] iArr31 = new int[lIIllllIl[1]];
                    iArr31[lIIllllIl[0]] = lIIllllIl[10];
                    if (lIIIIlIIIlII(Equipment.contains(iArr31) ? 1 : 0)) {
                        int[] iArr32 = new int[lIIllllIl[1]];
                        iArr32[lIIllllIl[0]] = lIIllllIl[10];
                        Inventory.getFirst(iArr32).interact(lIIllllII[lIIllllIl[43]]);
                    }
                }
            }
            if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[8]) && lIIIIlIIIlll(Skills.getLevel(Skill.DEFENCE), lIIllllIl[36])) {
                int[] iArr33 = new int[lIIllllIl[1]];
                iArr33[lIIllllIl[0]] = lIIllllIl[11];
                if (lIIIIlIIIIlI(Inventory.contains(iArr33) ? 1 : 0)) {
                    int[] iArr34 = new int[lIIllllIl[1]];
                    iArr34[lIIllllIl[0]] = lIIllllIl[11];
                    if (lIIIIlIIIlII(Equipment.contains(iArr34) ? 1 : 0)) {
                        int[] iArr35 = new int[lIIllllIl[1]];
                        iArr35[lIIllllIl[0]] = lIIllllIl[11];
                        Inventory.getFirst(iArr35).interact(lIIllllII[lIIllllIl[44]]);
                    }
                }
            }
            if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[8])) {
                int[] iArr36 = new int[lIIllllIl[1]];
                iArr36[lIIllllIl[0]] = lIIllllIl[12];
                if (lIIIIlIIIIlI(Inventory.contains(iArr36) ? 1 : 0)) {
                    int[] iArr37 = new int[lIIllllIl[1]];
                    iArr37[lIIllllIl[0]] = lIIllllIl[12];
                    Inventory.getFirst(iArr37).interact(lIIllllII[lIIllllIl[45]]);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v128, types: [boolean] */
    public static void ap() {
        if (lIIIIlIIIIlI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIllllII[lIIllllIl[0]];
            C0001b.a(bv);
            if (lIIIIlIIIIll(bv.size(), lIIllllIl[1])) {
                System.out.println(lIIllllII[lIIllllIl[1]]);
                bt = lIIllllIl[0];
            }
        }
        if (lIIIIlIIIlII(bt ? 1 : 0) && lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[2])) {
            if (lIIIIlIIIlII(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIlIIIlIl(nearest) && lIIIIlIIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllllII[lIIllllIl[3]];
                    C0000a.a(nearest);
                }
                if (lIIIIlIIIlIl(nearest) && lIIIIlIIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllllII[lIIllllIl[4]];
                    if (lIIIIlIIIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIllllIl[5]);
                        "".length();
                        Time.sleepTicks(lIIllllIl[4]);
                        "".length();
                    }
                    if (lIIIIlIIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIIlIIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIllllIl[6]);
                            "".length();
                        }
                        if (lIIIIlIIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIllllIl[3]);
                            "".length();
                        }
                        if (lIIIIlIIIlII(ac() ? 1 : 0)) {
                            af();
                            System.out.println(lIIllllII[lIIllllIl[7]]);
                            bt = lIIllllIl[1];
                            return;
                        }
                        if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[8])) {
                            C0000a.a(lIIllllIl[9], lIIllllIl[1]);
                            C0000a.a(lIIllllIl[10], lIIllllIl[1]);
                            C0000a.a(lIIllllIl[11], lIIllllIl[1]);
                            Bank.withdrawAll(lIIllllIl[12], Bank.WithdrawMode.ITEM);
                        }
                        if (lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[8])) {
                            C0000a.a(lIIllllIl[13], lIIllllIl[1]);
                            C0000a.a(lIIllllIl[14], lIIllllIl[1]);
                            C0000a.a(lIIllllIl[15], lIIllllIl[1]);
                            Bank.withdrawAll(lIIllllIl[16], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIllllIl[1]);
                            "".length();
                            Bank.withdrawAll(lIIllllIl[17], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIllllIl[1]);
                            "".length();
                            C0000a.a(lIIllllIl[18], lIIllllIl[1]);
                        }
                        C0000a.a(lIIllllIl[19], lIIllllIl[1]);
                        C0000a.a(lIIllllIl[20], lIIllllIl[1]);
                        C0000a.a(lIIllllIl[21], lIIllllIl[1]);
                        C0000a.a(lIIllllIl[22], lIIllllIl[1]);
                        C0000a.a(lIIllllIl[23], lIIllllIl[1]);
                        C0000a.a(lIIllllIl[24], lIIllllIl[25]);
                        C0000a.a(lIIllllIl[26], lIIllllIl[25]);
                        C0000a.a(lIIllllIl[27], Inventory.getFreeSlots());
                    }
                }
            }
            if (lIIIIlIIIIlI(ab() ? 1 : 0)) {
                aq();
                if (lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[28])) {
                    C0011l.Z();
                }
                if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[28]) && lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[8])) {
                    TileItem nearest2 = TileItems.getNearest(tileItem -> {
                        if (lIIIIlIIlIIl(tileItem.getId(), lIIllllIl[17]) && lIIIIlIIIlll(tileItem.getQuantity(), lIIllllIl[42])) {
                            ?? r0 = lIIllllIl[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIllllIl[0];
                    });
                    if (lIIIIlIIIlIl(nearest2)) {
                        nearest2.interact(lIIllllII[lIIllllIl[6]]);
                        Time.sleepTicks(lIIllllIl[7]);
                        "".length();
                    }
                    C0010k.X();
                }
            }
        }
    }

    private static void lIIIIlIIIIIl() {
        lIIllllIl = new int[63];
        lIIllllIl[0] = ((188 ^ 150) ^ ((101 ^ 59) & ((35 ^ 125) ^ (-1)))) & (((197 ^ 152) ^ (101 ^ 18)) ^ (-" ".length()));
        lIIllllIl[1] = " ".length();
        lIIllllIl[2] = (70 ^ 105) ^ (110 ^ 85);
        lIIllllIl[3] = "  ".length();
        lIIllllIl[4] = "   ".length();
        lIIllllIl[5] = (-25702) & 30701;
        lIIllllIl[6] = 147 ^ 150;
        lIIllllIl[7] = 90 ^ 94;
        lIIllllIl[8] = 15 ^ 61;
        lIIllllIl[9] = (-((-10499) & 16223)) & (-1) & 16223;
        lIIllllIl[10] = (-1025) & 3517;
        lIIllllIl[11] = (-13841) & 16339;
        lIIllllIl[12] = (-31762) & 32571;
        lIIllllIl[13] = (-((-5273) & 15519)) & (-5249) & 16335;
        lIIllllIl[14] = (-24629) & 25471;
        lIIllllIl[15] = (-((-16661) & 25023)) & (-4101) & 13311;
        lIIllllIl[16] = (-25730) & 26611;
        lIIllllIl[17] = (-(240 ^ 161)) & (-19591) & 20479;
        lIIllllIl[18] = (-31009) & 32103;
        lIIllllIl[19] = (-((-17) & 14967)) & (-16649) & 32767;
        lIIllllIl[20] = (-((-21257) & 29595)) & (-2309) & 11775;
        lIIllllIl[21] = (-1154) & 12279;
        lIIllllIl[22] = (-6402) & 8105;
        lIIllllIl[23] = (-1675) & 14299;
        lIIllllIl[24] = (-24725) & 32733;
        lIIllllIl[25] = (43 ^ 120) ^ (224 ^ 185);
        lIIllllIl[26] = (-((-3150) & 19695)) & (-5) & 24559;
        lIIllllIl[27] = (-14853) & 15231;
        lIIllllIl[28] = 112 ^ 110;
        lIIllllIl[29] = (-((-4985) & 32761)) & (-4185) & 32767;
        lIIllllIl[30] = (-((-13477) & 32231)) & (-4102) & 31735;
        lIIllllIl[31] = (230 ^ 137) ^ (79 ^ 38);
        lIIllllIl[32] = (((123 + 6) - 6) + 70) ^ (((61 + 93) - 47) + 91);
        lIIllllIl[33] = (((1 + 64) - (-53)) + 28) ^ (((141 + 151) - 230) + 92);
        lIIllllIl[34] = (-6413) & 15294;
        lIIllllIl[35] = 179 ^ 186;
        lIIllllIl[36] = 60 ^ 20;
        lIIllllIl[37] = (((112 + 16) - 22) + 24) ^ (((18 + 122) - 12) + 9);
        lIIllllIl[38] = 102 ^ 106;
        lIIllllIl[39] = (111 ^ 73) ^ (102 ^ 77);
        lIIllllIl[40] = (2 ^ 111) ^ (64 ^ 35);
        lIIllllIl[41] = ((147 + 206) - 296) + 183;
        lIIllllIl[42] = (103 ^ 11) ^ (219 ^ 184);
        lIIllllIl[43] = (148 ^ 176) ^ (23 ^ 35);
        lIIllllIl[44] = 66 ^ 83;
        lIIllllIl[45] = 109 ^ 127;
        lIIllllIl[46] = (-17704) & 32703;
        lIIllllIl[47] = (-((-4931) & 23399)) & (-3) & 20470;
        lIIllllIl[48] = (-((-3129) & 19771)) & (-5125) & 32766;
        lIIllllIl[49] = (-25797) & 32462;
        lIIllllIl[50] = (-266) & 35711;
        lIIllllIl[51] = (-9352) & 16351;
        lIIllllIl[52] = (-5407) & 22526;
        lIIllllIl[53] = 230 ^ 197;
        lIIllllIl[54] = (((35 + 55) - 59) + 170) ^ (((22 + 127) - 107) + 131);
        lIIllllIl[55] = (-((-135) & 29382)) & (-2049) & 31615;
        lIIllllIl[56] = (-((-11275) & 32043)) & (-19) & 32766;
        lIIllllIl[57] = (-((-14507) & 15550)) & (-6213) & 32255;
        lIIllllIl[58] = (-57) & 8063;
        lIIllllIl[59] = (-((-681) & 22203)) & (-8201) & 30622;
        lIIllllIl[60] = 209 ^ 194;
        lIIllllIl[61] = (138 ^ 199) ^ (25 ^ 65);
        lIIllllIl[62] = (((96 + 109) - 130) + 53) ^ (((61 + 77) - 40) + 52);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIllllIl[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x050a, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0598, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x05d2, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x060c, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0646, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0680, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x06ba, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x06f4, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x072e, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0768, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e4, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011e, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0158, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0192, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024b, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0285, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02bf, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02f9, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0333, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x036d, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0422, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x045c, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0496, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04d0, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v164, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v213, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v240, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v289, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[8]) && lIIIIlIIlIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIllllIl[41]) && lIIIIlIIIlll(Skills.getLevel(Skill.DEFENCE), lIIllllIl[36])) {
            int[] iArr = new int[lIIllllIl[1]];
            iArr[lIIllllIl[0]] = lIIllllIl[10];
            if (lIIIIlIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIllllIl[1]];
                iArr2[lIIllllIl[0]] = lIIllllIl[10];
            }
            int[] iArr3 = new int[lIIllllIl[1]];
            iArr3[lIIllllIl[0]] = lIIllllIl[11];
            if (lIIIIlIIIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIllllIl[1]];
                iArr4[lIIllllIl[0]] = lIIllllIl[11];
            }
            int[] iArr5 = new int[lIIllllIl[1]];
            iArr5[lIIllllIl[0]] = lIIllllIl[19];
            if (lIIIIlIIIlII(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIllllIl[1]];
                iArr6[lIIllllIl[0]] = lIIllllIl[19];
            }
            int[] iArr7 = new int[lIIllllIl[1]];
            iArr7[lIIllllIl[0]] = lIIllllIl[21];
            if (lIIIIlIIIlII(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIllllIl[1]];
                iArr8[lIIllllIl[0]] = lIIllllIl[21];
            }
            int[] iArr9 = new int[lIIllllIl[1]];
            iArr9[lIIllllIl[0]] = lIIllllIl[12];
            if (lIIIIlIIIlII(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIIllllIl[1]];
                iArr10[lIIllllIl[0]] = lIIllllIl[12];
            }
            int[] iArr11 = new int[lIIllllIl[1]];
            iArr11[lIIllllIl[0]] = lIIllllIl[9];
            if (lIIIIlIIIlII(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIllllIl[1]];
                iArr12[lIIllllIl[0]] = lIIllllIl[9];
            }
            int[] iArr13 = new int[lIIllllIl[1]];
            iArr13[lIIllllIl[0]] = lIIllllIl[27];
            if (lIIIIlIIIIlI(Inventory.contains(iArr13) ? 1 : 0)) {
                ?? r0 = lIIllllIl[1];
                "".length();
                return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllllIl[0];
        } else if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[8]) && lIIIIlIIlIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIllllIl[41]) && lIIIIlIIIIll(Skills.getLevel(Skill.DEFENCE), lIIllllIl[36])) {
            int[] iArr14 = new int[lIIllllIl[1]];
            iArr14[lIIllllIl[0]] = lIIllllIl[10];
            if (lIIIIlIIIlII(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIllllIl[1]];
                iArr15[lIIllllIl[0]] = lIIllllIl[10];
            }
            int[] iArr16 = new int[lIIllllIl[1]];
            iArr16[lIIllllIl[0]] = lIIllllIl[20];
            if (lIIIIlIIIlII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIllllIl[1]];
                iArr17[lIIllllIl[0]] = lIIllllIl[20];
            }
            int[] iArr18 = new int[lIIllllIl[1]];
            iArr18[lIIllllIl[0]] = lIIllllIl[19];
            if (lIIIIlIIIlII(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIllllIl[1]];
                iArr19[lIIllllIl[0]] = lIIllllIl[19];
            }
            int[] iArr20 = new int[lIIllllIl[1]];
            iArr20[lIIllllIl[0]] = lIIllllIl[21];
            if (lIIIIlIIIlII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIllllIl[1]];
                iArr21[lIIllllIl[0]] = lIIllllIl[21];
            }
            int[] iArr22 = new int[lIIllllIl[1]];
            iArr22[lIIllllIl[0]] = lIIllllIl[12];
            if (lIIIIlIIIlII(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIIllllIl[1]];
                iArr23[lIIllllIl[0]] = lIIllllIl[12];
            }
            int[] iArr24 = new int[lIIllllIl[1]];
            iArr24[lIIllllIl[0]] = lIIllllIl[9];
            if (lIIIIlIIIlII(Inventory.contains(iArr24) ? 1 : 0)) {
                int[] iArr25 = new int[lIIllllIl[1]];
                iArr25[lIIllllIl[0]] = lIIllllIl[9];
            }
            int[] iArr26 = new int[lIIllllIl[1]];
            iArr26[lIIllllIl[0]] = lIIllllIl[27];
            if (lIIIIlIIIIlI(Inventory.contains(iArr26) ? 1 : 0)) {
                ?? r02 = lIIllllIl[1];
                "".length();
                return ((23 ^ 116) & ((247 ^ 148) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r02;
            }
            return lIIllllIl[0];
        } else if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[28]) && lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[8])) {
            int[] iArr27 = new int[lIIllllIl[1]];
            iArr27[lIIllllIl[0]] = lIIllllIl[18];
            if (lIIIIlIIIlII(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[lIIllllIl[1]];
                iArr28[lIIllllIl[0]] = lIIllllIl[18];
            }
            int[] iArr29 = new int[lIIllllIl[1]];
            iArr29[lIIllllIl[0]] = lIIllllIl[20];
            if (lIIIIlIIIlII(Inventory.contains(iArr29) ? 1 : 0)) {
                int[] iArr30 = new int[lIIllllIl[1]];
                iArr30[lIIllllIl[0]] = lIIllllIl[20];
            }
            int[] iArr31 = new int[lIIllllIl[1]];
            iArr31[lIIllllIl[0]] = lIIllllIl[19];
            if (lIIIIlIIIlII(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lIIllllIl[1]];
                iArr32[lIIllllIl[0]] = lIIllllIl[19];
            }
            int[] iArr33 = new int[lIIllllIl[1]];
            iArr33[lIIllllIl[0]] = lIIllllIl[21];
            if (lIIIIlIIIlII(Inventory.contains(iArr33) ? 1 : 0)) {
                int[] iArr34 = new int[lIIllllIl[1]];
                iArr34[lIIllllIl[0]] = lIIllllIl[21];
            }
            int[] iArr35 = new int[lIIllllIl[1]];
            iArr35[lIIllllIl[0]] = lIIllllIl[17];
            if (lIIIIlIIIlII(Inventory.contains(iArr35) ? 1 : 0)) {
                int[] iArr36 = new int[lIIllllIl[1]];
                iArr36[lIIllllIl[0]] = lIIllllIl[17];
            }
            int[] iArr37 = new int[lIIllllIl[1]];
            iArr37[lIIllllIl[0]] = lIIllllIl[27];
            if (lIIIIlIIIIlI(Inventory.contains(iArr37) ? 1 : 0)) {
                ?? r03 = lIIllllIl[1];
                "".length();
                return 0 != 0 ? ((77 ^ 73) ^ (108 ^ 74)) & (((220 ^ 147) ^ (119 ^ 26)) ^ (-" ".length())) : r03;
            }
            return lIIllllIl[0];
        } else {
            int[] iArr38 = new int[lIIllllIl[1]];
            iArr38[lIIllllIl[0]] = lIIllllIl[18];
            if (lIIIIlIIIlII(Inventory.contains(iArr38) ? 1 : 0)) {
                int[] iArr39 = new int[lIIllllIl[1]];
                iArr39[lIIllllIl[0]] = lIIllllIl[18];
            }
            int[] iArr40 = new int[lIIllllIl[1]];
            iArr40[lIIllllIl[0]] = lIIllllIl[20];
            if (lIIIIlIIIlII(Inventory.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lIIllllIl[1]];
                iArr41[lIIllllIl[0]] = lIIllllIl[20];
            }
            int[] iArr42 = new int[lIIllllIl[1]];
            iArr42[lIIllllIl[0]] = lIIllllIl[19];
            if (lIIIIlIIIlII(Inventory.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[lIIllllIl[1]];
                iArr43[lIIllllIl[0]] = lIIllllIl[19];
            }
            int[] iArr44 = new int[lIIllllIl[1]];
            iArr44[lIIllllIl[0]] = lIIllllIl[21];
            if (lIIIIlIIIlII(Inventory.contains(iArr44) ? 1 : 0)) {
                int[] iArr45 = new int[lIIllllIl[1]];
                iArr45[lIIllllIl[0]] = lIIllllIl[21];
            }
            int[] iArr46 = new int[lIIllllIl[1]];
            iArr46[lIIllllIl[0]] = lIIllllIl[16];
            if (lIIIIlIIIlII(Inventory.contains(iArr46) ? 1 : 0)) {
                int[] iArr47 = new int[lIIllllIl[1]];
                iArr47[lIIllllIl[0]] = lIIllllIl[16];
            }
            int[] iArr48 = new int[lIIllllIl[1]];
            iArr48[lIIllllIl[0]] = lIIllllIl[13];
            if (lIIIIlIIIlII(Inventory.contains(iArr48) ? 1 : 0)) {
                int[] iArr49 = new int[lIIllllIl[1]];
                iArr49[lIIllllIl[0]] = lIIllllIl[13];
            }
            int[] iArr50 = new int[lIIllllIl[1]];
            iArr50[lIIllllIl[0]] = lIIllllIl[14];
            if (lIIIIlIIIlII(Inventory.contains(iArr50) ? 1 : 0)) {
                int[] iArr51 = new int[lIIllllIl[1]];
                iArr51[lIIllllIl[0]] = lIIllllIl[14];
            }
            int[] iArr52 = new int[lIIllllIl[1]];
            iArr52[lIIllllIl[0]] = lIIllllIl[15];
            if (lIIIIlIIIlII(Inventory.contains(iArr52) ? 1 : 0)) {
                int[] iArr53 = new int[lIIllllIl[1]];
                iArr53[lIIllllIl[0]] = lIIllllIl[15];
            }
            int[] iArr54 = new int[lIIllllIl[1]];
            iArr54[lIIllllIl[0]] = lIIllllIl[17];
            if (lIIIIlIIIlII(Inventory.contains(iArr54) ? 1 : 0)) {
                int[] iArr55 = new int[lIIllllIl[1]];
                iArr55[lIIllllIl[0]] = lIIllllIl[17];
            }
            int[] iArr56 = new int[lIIllllIl[1]];
            iArr56[lIIllllIl[0]] = lIIllllIl[27];
            if (lIIIIlIIIIlI(Inventory.contains(iArr56) ? 1 : 0)) {
                ?? r04 = lIIllllIl[1];
                "".length();
                return ((82 ^ 74) & ((50 ^ 42) ^ (-1))) > (116 ^ 112) ? (true ^ true) & ((true ^ true) ^ true) : r04;
            }
            return lIIllllIl[0];
        }
    }

    private static String lIIIIIlllllI(String llllllIIIllllI, String llllllIIIlllIl) {
        try {
            SecretKeySpec llllllIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIIllllIl[33]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllIl[3], llllllIIlIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIIIlllll) {
            llllllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIIIllI(int i) {
        return i > 0;
    }

    private static String lIIIIIllllIl(String llllllIIIIlllI, String llllllIIIIllIl) {
        String str = new String(Base64.getDecoder().decode(llllllIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIIIllII = new StringBuilder();
        char[] llllllIIIIlIll = llllllIIIIllIl.toCharArray();
        int llllllIIIIlIlI = lIIllllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllllIl[0];
        while (lIIIIlIIIIll(i, length)) {
            char llllllIIIIllll = charArray[i];
            llllllIIIIllII.append((char) (llllllIIIIllll ^ llllllIIIIlIll[llllllIIIIlIlI % llllllIIIIlIll.length]));
            "".length();
            llllllIIIIlIlI++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllIIIIllII);
    }

    private static boolean lIIIIlIIIIlI(int i) {
        return i != 0;
    }

    private static String lIIIIIllllll(String lllllIlllllIIl, String lllllIlllllIII) {
        try {
            SecretKeySpec lllllIllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIlllllIll = Cipher.getInstance("Blowfish");
            lllllIlllllIll.init(lIIllllIl[3], lllllIllllllII);
            return new String(lllllIlllllIll.doFinal(Base64.getDecoder().decode(lllllIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIlllllIlI) {
            lllllIlllllIlI.printStackTrace();
            return null;
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            ap();
            "".length();
            if (" ".length() < " ".length()) {
                return (219 ^ 135) & ((92 ^ 0) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIllllIl[54];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[2])) {
            ?? r0 = lIIllllIl[1];
            "".length();
            return 0 != 0 ? ((248 ^ 187) ^ " ".length()) & (((7 ^ 27) ^ (1 ^ 95)) ^ (-" ".length())) : r0;
        }
        return lIIllllIl[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x036f, code lost:
        if (lIIIIlIIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ac() {
        if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[8]) && lIIIIlIIlIIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIllllIl[41]) && lIIIIlIIIlll(Skills.getLevel(Skill.DEFENCE), lIIllllIl[36])) {
            int[] iArr = new int[lIIllllIl[1]];
            iArr[lIIllllIl[0]] = lIIllllIl[10];
            if (lIIIIlIIIIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIllllIl[1]];
                iArr2[lIIllllIl[0]] = lIIllllIl[11];
                if (lIIIIlIIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIllllIl[1]];
                    iArr3[lIIllllIl[0]] = lIIllllIl[19];
                    if (lIIIIlIIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIllllIl[1]];
                        iArr4[lIIllllIl[0]] = lIIllllIl[21];
                        if (lIIIIlIIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIllllIl[1]];
                            iArr5[lIIllllIl[0]] = lIIllllIl[12];
                            if (lIIIIlIIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIllllIl[1]];
                                iArr6[lIIllllIl[0]] = lIIllllIl[9];
                                if (lIIIIlIIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIllllIl[1]];
                                    iArr7[lIIllllIl[0]] = lIIllllIl[27];
                                    if (lIIIIlIIIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                                        ?? r0 = lIIllllIl[1];
                                        "".length();
                                        return 0 != 0 ? ((199 ^ 139) ^ (209 ^ 180)) & (((234 ^ 136) ^ (72 ^ 3)) ^ (-" ".length())) : r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lIIllllIl[0];
        } else if (lIIIIlIIIlll(Skills.getLevel(Skill.RANGED), lIIllllIl[28]) && lIIIIlIIIIll(Skills.getLevel(Skill.RANGED), lIIllllIl[8])) {
            int[] iArr8 = new int[lIIllllIl[1]];
            iArr8[lIIllllIl[0]] = lIIllllIl[18];
            if (lIIIIlIIIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIllllIl[1]];
                iArr9[lIIllllIl[0]] = lIIllllIl[20];
                if (lIIIIlIIIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIllllIl[1]];
                    iArr10[lIIllllIl[0]] = lIIllllIl[19];
                    if (lIIIIlIIIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIllllIl[1]];
                        iArr11[lIIllllIl[0]] = lIIllllIl[21];
                        if (lIIIIlIIIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIllllIl[1]];
                            iArr12[lIIllllIl[0]] = lIIllllIl[17];
                            if (lIIIIlIIIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIllllIl[1]];
                                iArr13[lIIllllIl[0]] = lIIllllIl[27];
                                if (lIIIIlIIIIlI(Bank.contains(iArr13) ? 1 : 0)) {
                                    ?? r02 = lIIllllIl[1];
                                    "".length();
                                    return "   ".length() < 0 ? ((96 ^ 51) ^ (165 ^ 192)) & (((179 ^ 129) ^ (145 ^ 149)) ^ (-" ".length())) : r02;
                                }
                            }
                        }
                    }
                }
            }
            return lIIllllIl[0];
        } else {
            int[] iArr14 = new int[lIIllllIl[1]];
            iArr14[lIIllllIl[0]] = lIIllllIl[18];
            if (lIIIIlIIIIlI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIllllIl[1]];
                iArr15[lIIllllIl[0]] = lIIllllIl[20];
                if (lIIIIlIIIIlI(Bank.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lIIllllIl[1]];
                    iArr16[lIIllllIl[0]] = lIIllllIl[19];
                    if (lIIIIlIIIIlI(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIllllIl[1]];
                        iArr17[lIIllllIl[0]] = lIIllllIl[21];
                        if (lIIIIlIIIIlI(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIllllIl[1]];
                            iArr18[lIIllllIl[0]] = lIIllllIl[13];
                            if (lIIIIlIIIIlI(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[lIIllllIl[1]];
                                iArr19[lIIllllIl[0]] = lIIllllIl[24];
                                if (lIIIIlIIIIlI(Bank.contains(iArr19) ? 1 : 0)) {
                                    int[] iArr20 = new int[lIIllllIl[1]];
                                    iArr20[lIIllllIl[0]] = lIIllllIl[14];
                                    if (lIIIIlIIIIlI(Bank.contains(iArr20) ? 1 : 0)) {
                                        int[] iArr21 = new int[lIIllllIl[1]];
                                        iArr21[lIIllllIl[0]] = lIIllllIl[15];
                                        if (lIIIIlIIIIlI(Bank.contains(iArr21) ? 1 : 0)) {
                                            int[] iArr22 = new int[lIIllllIl[1]];
                                            iArr22[lIIllllIl[0]] = lIIllllIl[16];
                                            if (lIIIIlIIIlII(Bank.contains(iArr22) ? 1 : 0)) {
                                                int[] iArr23 = new int[lIIllllIl[1]];
                                                iArr23[lIIllllIl[0]] = lIIllllIl[16];
                                            }
                                            int[] iArr24 = new int[lIIllllIl[1]];
                                            iArr24[lIIllllIl[0]] = lIIllllIl[17];
                                            if (lIIIIlIIIIlI(Bank.contains(iArr24) ? 1 : 0)) {
                                                int[] iArr25 = new int[lIIllllIl[1]];
                                                iArr25[lIIllllIl[0]] = lIIllllIl[27];
                                                if (lIIIIlIIIIlI(Bank.contains(iArr25) ? 1 : 0)) {
                                                    ?? r03 = lIIllllIl[1];
                                                    "".length();
                                                    return 0 != 0 ? ((73 ^ 63) ^ (127 ^ 75)) & (((231 ^ 132) ^ (33 ^ 0)) ^ (-" ".length())) : r03;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lIIllllIl[0];
        }
    }
}
