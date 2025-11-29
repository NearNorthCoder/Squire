/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Bulk opening", register=true)
public class bB
extends Task {
    private final /* synthetic */ ExecutorService gf;
    private static /* synthetic */ int[] lIIIllIll;
    private /* synthetic */ String gg;
    private final /* synthetic */ Client ge;
    private static /* synthetic */ String[] lIIIllIIl;

    public boolean run() {
        return lIIIllIll[0];
    }

    private static boolean llllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllIIllll(String llIIlIllIIllIII, String llIIlIllIIlIlll) {
        llIIlIllIIllIII = new String(Base64.getDecoder().decode(llIIlIllIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlIllIIlIllI = new StringBuilder();
        char[] llIIlIllIIlIlIl = llIIlIllIIlIlll.toCharArray();
        int llIIlIllIIlIlII = lIIIllIll[0];
        char[] llIIlIllIIIlllI = llIIlIllIIllIII.toCharArray();
        int llIIlIllIIIllIl = llIIlIllIIIlllI.length;
        int llIIlIllIIIllII = lIIIllIll[0];
        while (bB.llllIllIII(llIIlIllIIIllII, llIIlIllIIIllIl)) {
            char llIIlIllIIllIIl = llIIlIllIIIlllI[llIIlIllIIIllII];
            llIIlIllIIlIllI.append((char)(llIIlIllIIllIIl ^ llIIlIllIIlIlIl[llIIlIllIIlIlII % llIIlIllIIlIlIl.length]));
            "".length();
            ++llIIlIllIIlIlII;
            ++llIIlIllIIIllII;
            "".length();
            if (((6 ^ 0x56) & ~(0xF3 ^ 0xA3)) < "  ".length()) continue;
            return null;
        }
        return String.valueOf(llIIlIllIIlIllI);
    }

    public boolean cN() {
        bB llIIlIllIlllIII;
        if (bB.llllIlIlII(this.gg)) {
            return lIIIllIll[0];
        }
        String[] stringArray = new String[lIIIllIll[1]];
        stringArray[bB.lIIIllIll[0]] = llIIlIllIlllIII.gg;
        List llIIlIllIllIlll = Inventory.getAll((String[])stringArray);
        int llIIlIllIllIllI = lIIIllIll[0];
        Iterator llIIlIllIllIlIl = llIIlIllIllIlll.iterator();
        while (bB.llllIlIlIl(llIIlIllIllIlIl.hasNext() ? 1 : 0)) {
            Item llIIlIllIllIlII = (Item)llIIlIllIllIlIl.next();
            if (bB.llllIlIllI(llIIlIllIllIllI++, lIIIllIll[2])) {
                "".length();
                if ("   ".length() >= 0) break;
                return ((94 + 0 - -58 + 5 ^ 89 + 28 - 20 + 49) & (69 + 25 - 41 + 112 ^ 103 + 44 - 134 + 157 ^ -" ".length())) != 0;
            }
            llIIlIllIllIlII.interact(lIIIllIIl[lIIIllIll[0]]);
            "".length();
            if ("   ".length() != ((42 + 41 - -13 + 50 ^ 61 + 59 - 78 + 115) & (0x15 ^ 0x4C ^ (0x4B ^ 0x1D) ^ -" ".length()))) continue;
            return ((0x58 ^ 0x17 ^ (0xD ^ 1)) & (95 + 57 - -44 + 9 ^ 124 + 138 - 190 + 70 ^ -" ".length())) != 0;
        }
        this.sleep(lIIIllIll[1]);
        this.gg = null;
        return lIIIllIll[1];
    }

    private static boolean llllIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlIlII(Object object) {
        return object == null;
    }

    private static boolean llllIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String llllIIllIl(String llIIlIllIlIIllI, String llIIlIllIlIIlll) {
        try {
            SecretKeySpec llIIlIllIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIllIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIllIlIlIlI = Cipher.getInstance("Blowfish");
            llIIlIllIlIlIlI.init(lIIIllIll[3], llIIlIllIlIlIll);
            return new String(llIIlIllIlIlIlI.doFinal(Base64.getDecoder().decode(llIIlIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIllIlIlIIl) {
            llIIlIllIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static void llllIlIIll() {
        lIIIllIll = new int[6];
        bB.lIIIllIll[0] = (7 ^ 0x48 ^ (0x70 ^ 0x2C)) & (153 + 120 - 216 + 133 ^ 46 + 5 - -47 + 75 ^ -" ".length());
        bB.lIIIllIll[1] = " ".length();
        bB.lIIIllIll[2] = 0x53 ^ 0x5B;
        bB.lIIIllIll[3] = "  ".length();
        bB.lIIIllIll[4] = "   ".length();
        bB.lIIIllIll[5] = 0x5B ^ 6 ^ (0xD2 ^ 0x8B);
    }

    private static boolean llllIlIlll(int n2) {
        return n2 == 0;
    }

    private static void llllIlIIII() {
        lIIIllIIl = new String[lIIIllIll[5]];
        bB.lIIIllIIl[bB.lIIIllIll[0]] = bB.llllIIllIl("+QjqOSEvIH0=", "CSdxY");
        bB.lIIIllIIl[bB.lIIIllIll[1]] = bB.llllIIllIl("I72n/GULN58=", "Ykwco");
        bB.lIIIllIIl[bB.lIIIllIll[3]] = bB.llllIIllll("NzYVKg==", "GWvAm");
        bB.lIIIllIIl[bB.lIIIllIll[4]] = bB.llllIIllIl("/Z99RmM4i4TLupFVpLT9ZGqLizG0uvA0", "ttnke");
    }

    static {
        bB.llllIlIIll();
        bB.llllIlIIII();
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        if (!bB.llllIlIlIl(lIIIllIIl[lIIIllIll[1]].equals(menuEntryAdded.getOption()) ? 1 : 0) || bB.llllIlIlll(menuEntryAdded.getTarget().contains(lIIIllIIl[lIIIllIll[3]]) ? 1 : 0)) {
            return;
        }
        this.ge.createMenuEntry(this.ge.getMenuOptionCount()).setOption(lIIIllIIl[lIIIllIll[4]]).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            this.gg = Text.removeTags((String)menuEntryAdded.getTarget());
            this.gf.submit(this::cN);
            "".length();
        });
        "".length();
    }

    @Inject
    public bB(Client client, ExecutorService executorService) {
        this.ge = client;
        this.gf = executorService;
    }
}

