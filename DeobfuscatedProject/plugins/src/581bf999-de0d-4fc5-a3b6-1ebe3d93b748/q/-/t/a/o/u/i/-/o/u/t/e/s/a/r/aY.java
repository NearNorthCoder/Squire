/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Looting chest room", priority=1000, blocking=true)
public class aY
extends ao {
    private static final /* synthetic */ int ey;
    private /* synthetic */ boolean eA;
    private static /* synthetic */ int[] llIlIllIIlI;
    private static final /* synthetic */ int ez;
    private static final /* synthetic */ int ew;
    private static /* synthetic */ String[] llIlIllIIIl;
    private static final /* synthetic */ int ex;

    @Override
    public boolean bj() {
        int n2;
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[17])) {
                String[] stringArray = new String[llIlIllIIlI[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[19]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIllIIlI[1];
                    "".length();
                    if (-" ".length() == -" ".length()) return n2 != 0;
                    return ("  ".length() & ~"  ".length()) != 0;
                }
            }
            n2 = llIlIllIIlI[2];
            return n2 != 0;
        })) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(this.eA ? 1 : 0)) {
            n2 = llIlIllIIlI[1];
            "".length();
            if ("  ".length() < " ".length()) {
                return ((14 + 59 - -69 + 29 ^ 58 + 63 - 6 + 58) & (0 ^ 0x3E ^ (0x55 ^ 0x6D) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIlIllIIlI[2];
        }
        return n2 != 0;
    }

    @Override
    public void r() {
        this.eA = llIlIllIIlI[2];
    }

    @Inject
    protected aY(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        Widget widget = Widgets.get((int)llIlIllIIlI[4], (int)llIlIllIIlI[5]);
        ItemContainer itemContainer = this.cu.getItemContainer(InventoryID.TOA_REWARD_CHEST);
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(Widgets.isVisible((Widget)widget) ? 1 : 0) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllII(itemContainer)) {
            void llllllllllllllllIIllIIIlllllIIII;
            int llllllllllllllllIIllIIIllllIlllI;
            void llllllllllllllllIIllIIIllllIllII;
            int n2 = llIlIllIIlI[1];
            Item[] itemArray = itemContainer.getItems();
            int n3 = itemArray.length;
            int llllllllllllllllIIllIIIllllIlIll = llIlIllIIlI[2];
            while (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllIl(llllllllllllllllIIllIIIllllIlIll, (int)llllllllllllllllIIllIIIllllIllII)) {
                void llllllllllllllllIIllIIIllllIllIl;
                void llllllllllllllllIIllIIIllllIlIlI = llllllllllllllllIIllIIIllllIllIl[llllllllllllllllIIllIIIllllIlIll];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlllI(llllllllllllllllIIllIIIllllIlIlI.getId(), llIlIllIIlI[1])) {
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return ((0x11 ^ 0x1F) & ~(0xBC ^ 0xB2)) != 0;
                    }
                } else {
                    llllllllllllllllIIllIIIllllIlllI = llIlIllIIlI[2];
                }
                ++llllllllllllllllIIllIIIllllIlIll;
                "".length();
                if ("  ".length() < "   ".length()) continue;
                return ((0x48 ^ 0x45) & ~(0x59 ^ 0x54)) != 0;
            }
            llllllllllllllllIIllIIIlllllIIIl.eA = llllllllllllllllIIllIIIllllIlllI;
            llllllllllllllllIIllIIIlllllIIII.interact(llIlIllIIIl[llIlIllIIlI[2]]);
            return llIlIllIIlI[1];
        }
        TileObject llllllllllllllllIIllIIIllllIlllI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[17])) {
                String[] stringArray = new String[llIlIllIIlI[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[18]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIllIIlI[1];
                    "".length();
                    if (((132 + 143 - 178 + 54 ^ 14 + 177 - 135 + 137) & (0x52 ^ 0x3A ^ (0x36 ^ 8) ^ -" ".length())) == 0) return n2 != 0;
                    return ((0xAC ^ 0xB6 ^ (0xCB ^ 0x98)) & (0x7D ^ 0x48 ^ (0x2C ^ 0x50) ^ -" ".length())) != 0;
                }
            }
            n2 = llIlIllIIlI[2];
            return n2 != 0;
        });
        TileObject llllllllllllllllIIllIIIllllIllIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(List.of(Integer.valueOf(llIlIllIIlI[13]), Integer.valueOf(llIlIllIIlI[14]), Integer.valueOf(llIlIllIIlI[15])).contains(tileObject.getId()) ? 1 : 0)) {
                String[] stringArray = new String[llIlIllIIlI[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[16]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIllIIlI[1];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0x64 ^ 0x46 ^ (0x89 ^ 0xB1)) & (0x3C ^ 0x2E ^ (2 ^ 0xA) ^ -" ".length())) != 0;
                }
            }
            n2 = llIlIllIIlI[2];
            return n2 != 0;
        });
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(llllllllllllllllIIllIIIllllIlllI) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(llllllllllllllllIIllIIIllllIllIl)) {
            TileObject llllllllllllllllIIllIIIllllIllII = TileObjects.getNearest(tileObject -> {
                boolean bl2;
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[12])) {
                    bl2 = llIlIllIIlI[1];
                    "".length();
                    if (" ".length() == ((0x3E ^ 0x2C ^ (0x80 ^ 0x86)) & (29 + 106 - 72 + 106 ^ 80 + 166 - 146 + 89 ^ -" ".length()))) {
                        return ((0x5D ^ 0x55 ^ (0x80 ^ 0xAD)) & (183 + 112 - 272 + 202 ^ 86 + 14 - 92 + 188 ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIlIllIIlI[2];
                }
                return bl2;
            });
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(llllllllllllllllIIllIIIllllIllII) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(llllllllllllllllIIllIIIllllIllII = TileObjects.getNearest(tileObject -> tileObject.getName().toLowerCase().contains(llIlIllIIIl[llIlIllIIlI[11]])))) {
                return llIlIllIIlI[2];
            }
            String[] stringArray = new String[llIlIllIIlI[6]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[1]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[1]] = llIlIllIIIl[llIlIllIIlI[6]];
            llllllllllllllllIIllIIIllllIllII.interact(stringArray);
            return llIlIllIIlI[1];
        }
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllII(llllllllllllllllIIllIIIllllIlllI)) {
            llllllllllllllllIIllIIIllllIlllI.interact(llIlIllIIIl[llIlIllIIlI[7]]);
            "".length();
            if (((0x1C ^ 6 ^ (0x6B ^ 0x3A)) & (0xB ^ 0x15 ^ (0x2F ^ 0x7A) ^ -" ".length())) > 0) {
                return ((79 + 94 - 29 + 52 ^ 108 + 35 - 104 + 153) & (0x53 ^ 0x1F ^ (0x11 ^ 0x59) ^ -" ".length())) != 0;
            }
        } else {
            llllllllllllllllIIllIIIllllIllIl.interact(llIlIllIIIl[llIlIllIIlI[5]]);
        }
        return llIlIllIIlI[1];
    }

    private static String lIlIIllllIIlIl(String llllllllllllllllIIllIIIllIlIllll, String llllllllllllllllIIllIIIllIllIIII) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIllIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIllIllIIII.getBytes(StandardCharsets.UTF_8)), llIlIllIIlI[11]), "DES");
            Cipher llllllllllllllllIIllIIIllIllIIll = Cipher.getInstance("DES");
            llllllllllllllllIIllIIIllIllIIll.init(llIlIllIIlI[6], llllllllllllllllIIllIIIllIllIlII);
            return new String(llllllllllllllllIIllIIIllIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIIllIllIIlI) {
            llllllllllllllllIIllIIIllIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllllIllII(Object object) {
        return object != null;
    }

    @Override
    public boolean bk() {
        boolean bl2;
        int[] nArray = new int[llIlIllIIlI[1]];
        nArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIlI[3];
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllII(TileObjects.getNearest((int[])nArray))) {
            bl2 = llIlIllIIlI[1];
            "".length();
            if (-" ".length() == "   ".length()) {
                return ((0x94 ^ 0x8F ^ (0xAA ^ 0x82)) & (0x18 ^ 0x79 ^ (0x73 ^ 0x21) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIlIllIIlI[2];
        }
        return bl2;
    }

    private static String lIlIIllllIIlll(String llllllllllllllllIIllIIIlllIlIllI, String llllllllllllllllIIllIIIlllIlIIll) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIlllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIlllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIIIlllIllIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIIIlllIllIII.init(llIlIllIIlI[6], llllllllllllllllIIllIIIlllIllIIl);
            return new String(llllllllllllllllIIllIIIlllIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIIlllIlIlll) {
            llllllllllllllllIIllIIIlllIlIlll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[llIlIllIIlI[1]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[8]];
            Dialog.chooseOption((String[])stringArray);
            "".length();
            this.sleep(llIlIllIIlI[8]);
            return llIlIllIIlI[1];
        }
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIlIllIIlI[1];
        }
        String[] stringArray = new String[llIlIllIIlI[1]];
        stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[9]];
        NPC llllllllllllllllIIllIIIllllIIllI = NPCs.getNearest((String[])stringArray);
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(llllllllllllllllIIllIIIllllIIllI)) {
            return llIlIllIIlI[2];
        }
        var1_1.interact(llIlIllIIIl[llIlIllIIlI[10]]);
        return llIlIllIIlI[1];
    }

    static {
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIIl();
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIII();
        ez = llIlIllIIlI[12];
        ey = llIlIllIIlI[5];
        ex = llIlIllIIlI[4];
        ew = llIlIllIIlI[3];
    }

    private static String lIlIIllllIIllI(String llllllllllllllllIIllIIIlllIIIllI, String llllllllllllllllIIllIIIlllIIIIII) {
        llllllllllllllllIIllIIIlllIIIllI = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIIlllIIIlII = new StringBuilder();
        char[] llllllllllllllllIIllIIIlllIIIIll = llllllllllllllllIIllIIIlllIIIIII.toCharArray();
        int llllllllllllllllIIllIIIlllIIIIlI = llIlIllIIlI[2];
        char[] llllllllllllllllIIllIIIllIllllII = llllllllllllllllIIllIIIlllIIIllI.toCharArray();
        int llllllllllllllllIIllIIIllIlllIll = llllllllllllllllIIllIIIllIllllII.length;
        int llllllllllllllllIIllIIIllIlllIlI = llIlIllIIlI[2];
        while (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllIl(llllllllllllllllIIllIIIllIlllIlI, llllllllllllllllIIllIIIllIlllIll)) {
            char llllllllllllllllIIllIIIlllIIIlll = llllllllllllllllIIllIIIllIllllII[llllllllllllllllIIllIIIllIlllIlI];
            llllllllllllllllIIllIIIlllIIIlII.append((char)(llllllllllllllllIIllIIIlllIIIlll ^ llllllllllllllllIIllIIIlllIIIIll[llllllllllllllllIIllIIIlllIIIIlI % llllllllllllllllIIllIIIlllIIIIll.length]));
            "".length();
            ++llllllllllllllllIIllIIIlllIIIIlI;
            ++llllllllllllllllIIllIIIllIlllIlI;
            "".length();
            if (((0x3D ^ 0x1D) & ~(0xB2 ^ 0x92)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIIIlllIIIlII);
    }

    private static void lIlIIllllIlIII() {
        llIlIllIIIl = new String[llIlIllIIlI[20]];
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIlIl("8Fu8iv2F1+WBYNstS6u60g==", "TgFgB");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[1]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIllI("IBwHFg==", "olbxa");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[6]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIllI("BSYrAhA+", "VCJps");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[7]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIlIl("JUPO/G8qN8w=", "pVAZz");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[5]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIlll("eqZwiFmwNas=", "kfbXE");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[8]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIlIl("G8ArP23ur0A=", "tASPp");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[9]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIlIl("+T28H1MzS02wkR2nJIfqrg==", "MuINS");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[10]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIlll("xrGobRovJ30=", "LfVTa");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[11]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIlIl("7JPilKgGp24vB06tstjVXQ==", "LNwDd");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[16]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIlIl("Z06sXn5oX0w=", "dwNOJ");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[18]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIlIl("PkEC6WkjpgE=", "DCWdx");
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[19]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIIllI("Pzw3Gw==", "pLRuT");
    }

    private static boolean lIlIIllllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllllIlIll(int n2) {
        return n2 != 0;
    }

    private static void lIlIIllllIlIIl() {
        llIlIllIIlI = new int[21];
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[0] = -(0xFFFFFE2C & 0x47FB) & (0xFFFFFF7F & 0x7FF7);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[1] = " ".length();
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2] = (187 + 117 - 171 + 70 ^ 119 + 35 - 145 + 127) & (116 + 36 - 49 + 31 ^ 190 + 146 - 144 + 5 ^ -" ".length());
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[3] = 0xFFFFBFEF & 0xEF9E;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[4] = 0xFFFF9793 & 0x6B6F;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[5] = 0xAD ^ 0xA9;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[6] = "  ".length();
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[7] = "   ".length();
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[8] = 1 ^ 0x15 ^ (0x82 ^ 0x93);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[9] = 0x4B ^ 0x4D;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[10] = 0xEF ^ 0x94 ^ (0xC6 ^ 0xBA);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[11] = 0x85 ^ 0x8D;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[12] = 0xFFFFB4EF & 0xFF9C;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[13] = -" ".length() & (0xFFFFBFFF & 0xEEF3);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[14] = -" ".length() & (0xFFFFFEF7 & 0xAFFC);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[15] = -(0xFFFFDD5D & 0x62A3) & (0xFFFFFFFD & 0xEEF7);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[16] = 127 + 75 - 131 + 114 ^ 131 + 114 - 181 + 112;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[17] = 0xFFFFFF2F & 0x75FA;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[18] = 58 + 106 - 26 + 63 ^ 105 + 62 - 44 + 72;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[19] = 33 + 69 - -13 + 27 ^ 44 + 102 - 87 + 74;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[20] = 56 + 19 - 29 + 157 ^ 30 + 16 - -4 + 149;
    }

    private static boolean lIlIIllllIlIlI(Object object) {
        return object == null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean lIlIIllllIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int bi() {
        return llIlIllIIlI[0];
    }

    private static boolean lIlIIllllIlllI(int n2, int n3) {
        return n2 <= n3;
    }
}

