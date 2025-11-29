/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;

@TaskDesc(name="Eating Food", priority=250)
public class ak
extends Z {
    private final /* synthetic */ C cN;
    private final /* synthetic */ SquireAutoTOA cO;
    private static /* synthetic */ int[] llIllIIlllI;
    private static /* synthetic */ String[] llIllIIllIl;

    @Inject
    protected ak(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cN = c2;
        this.cO = squireAutoTOA;
    }

    private static boolean lIlIlIIlIlllIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIIlIlllII() {
        llIllIIlllI = new int[4];
        ak.llIllIIlllI[0] = (130 + 148 - 111 + 11 ^ 178 + 160 - 336 + 181) & (139 + 31 - 58 + 51 ^ 129 + 30 - 144 + 151 ^ -1);
        ak.llIllIIlllI[1] = 1;
        ak.llIllIIlllI[2] = 2;
        ak.llIllIIlllI[3] = 0x64 ^ 0x6C;
    }

    private static String lIlIlIIlIllIlI(String llllllllllllllllIIlIllIlllllIllI, String llllllllllllllllIIlIllIlllllIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIllllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlllllIIll.getBytes(StandardCharsets.UTF_8)), llIllIIlllI[3]), "DES");
            Cipher llllllllllllllllIIlIllIllllllIII = Cipher.getInstance("DES");
            llllllllllllllllIIlIllIllllllIII.init(llIllIIlllI[2], llllllllllllllllIIlIllIllllllIIl);
            return new String(llllllllllllllllIIlIllIllllllIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllIlllllIlll) {
            llllllllllllllllIIlIllIlllllIlll.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        ak llllllllllllllllIIlIllIlllllllll;
        if (ak.lIlIlIIlIlllIl(this.cO.e() ? 1 : 0)) {
            return llIllIIlllI[0];
        }
        if (ak.lIlIlIIlIllllI(llllllllllllllllIIlIllIlllllllll.cu.isInInstancedRegion() ? 1 : 0)) {
            return llIllIIlllI[0];
        }
        if (!ak.lIlIlIIlIlllIl(llllllllllllllllIIlIllIlllllllll.cN.al() ? 1 : 0) || ak.lIlIlIIlIllllI(llllllllllllllllIIlIllIlllllllll.cN.ar() ? 1 : 0)) {
            return llIllIIlllI[0];
        }
        Item llllllllllllllllIIlIllIllllllllI = Inventory.getFirst(item -> item.hasAction(llIllIIllIl[llIllIIlllI[1]]::equals));
        if (ak.lIlIlIIlIlllll(llllllllllllllllIIlIllIllllllllI)) {
            llllllllllllllllIIlIllIlllllllll.cN.an();
            llllllllllllllllIIlIllIllllllllI.interact(llIllIIllIl[llIllIIlllI[0]]);
            return llIllIIlllI[1];
        }
        return llIllIIlllI[0];
    }

    private static boolean lIlIlIIlIlllll(Object object) {
        return object != null;
    }

    static {
        ak.lIlIlIIlIlllII();
        ak.lIlIlIIlIllIll();
    }

    private static boolean lIlIlIIlIllllI(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIIlIllIll() {
        llIllIIllIl = new String[llIllIIlllI[2]];
        ak.llIllIIllIl[ak.llIllIIlllI[0]] = ak."Eat";
        ak.llIllIIllIl[ak.llIllIIlllI[1]] = ak."Eat";
    }
}

