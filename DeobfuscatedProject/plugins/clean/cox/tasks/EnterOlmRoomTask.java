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
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.GameEnum32;
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
public class EnterOlmRoomTask
extends CoxTaskBase {

    private static void llIlIIlIIlllIl() {
        lIIllllIllll = new String[lIIlllllIIll[1]];
        aI.lIIllllIllll[aI.lIIlllllIIll[0]] = "Quick-pass";
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
        aI var1;
        if (aI.llIlIIlIIlllll(this.ct() ? 1 : 0)) {
            return lIIlllllIIll[0];
        }
        if (aI.llIlIIlIlIIIII((Object)u.bh(), (Object)w.GET_OUT)) {
            return lIIlllllIIll[0];
        }
        TileObject var2 = var1.dq();
        if (aI.llIlIIlIlIIIIl(var2)) {
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
    protected EnterOlmRoomTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
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

        arrayList.addAll(list);

        return arrayList;
    }
}

