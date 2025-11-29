/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aR;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.w;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Enter Olm Room", priority=21000, blocking=true)
public class aI
extends aR {
    private static /* synthetic */ int[] lIIlllllIIll;
    private static /* synthetic */ String[] lIIllllIllll;

    private static String llIlIIlIIIllIl(String lllllllllllllllIlllIlIIIlIIIllll, String lllllllllllllllIlllIlIIIlIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIlIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIlIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIlIIlIIIl.init(lIIlllllIIll[2], lllllllllllllllIlllIlIIIlIIlIIlI);
            return new String(lllllllllllllllIlllIlIIIlIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIlIIlIIII) {
            lllllllllllllllIlllIlIIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIIlllIl() {
        lIIllllIllll = new String[lIIlllllIIll[1]];
        aI.lIIllllIllll[aI.lIIlllllIIll[0]] = aI."Quick-pass";
    }

    private static boolean llIlIIlIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        aI lllllllllllllllIlllIlIIIlIlIIIII;
        if (aI.llIlIIlIIlllll(this.ct() ? 1 : 0)) {
            return lIIlllllIIll[0];
        }
        if (aI.llIlIIlIlIIIII((Object)u.bh(), (Object)w.GET_OUT)) {
            return lIIlllllIIll[0];
        }
        TileObject lllllllllllllllIlllIlIIIlIIlllll = lllllllllllllllIlllIlIIIlIlIIIII.dq();
        if (aI.llIlIIlIlIIIIl(lllllllllllllllIlllIlIIIlIIlllll)) {
            return lIIlllllIIll[0];
        }
        var1_1.interact(lIIllllIllll[lIIlllllIIll[0]]);
        return lIIlllllIIll[1];
    }

    static {
        aI.llIlIIlIIllllI();
        aI.llIlIIlIIlllIl();
    }

    private static boolean llIlIIlIlIIIIl(Object object) {
        return object == null;
    }

    @Inject
    protected aI(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void llIlIIlIIllllI() {
        lIIlllllIIll = new int[3];
        aI.lIIlllllIIll[0] = (0x53 ^ 0x37 ^ (0x8B ^ 0xB5)) & (46 + 199 - 215 + 197 ^ 160 + 15 - 142 + 152 ^ -1);
        aI.lIIlllllIIll[1] = 1;
        aI.lIIlllllIIll[2] = 2;
    }

    private static boolean llIlIIlIIlllll(int n2) {
        return n2 != 0;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aI.llIlIIlIlIIIIl(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }
}

