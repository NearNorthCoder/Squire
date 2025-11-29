/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Setting up raid", priority=20000, blocking=true)
public class SettingUpRaidTask
extends CoxTaskBase {

    private static boolean llIllIIlllllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIlIIIIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        if (W.llIllIIlllllll(u.bf() ? 1 : 0)) {
            bl2 = lIlIIllIIIIl[1];

            if (2 < 2) {
                return false;
            }
        } else {
            bl2 = lIlIIllIIIIl[0];
        }
        return bl2;
    }

    private static void llIllIIllIIlII() {
        lIlIIlIllIlI = new String[lIlIIllIIIIl[6]];
        W.lIlIIlIllIlI[W.lIlIIllIIIIl[0]] = "Begin the raid.";
        W.lIlIIlIllIlI[W.lIlIIllIIIIl[1]] = "Begin the raid.";
        W.lIlIIlIllIlI[W.lIlIIllIIIIl[4]] = "Couldnt find button";
        W.lIlIIlIllIlI[W.lIlIIllIIIIl[5]] = "Start raid";
    }

    static {
        W.llIllIIllllllI();
        W.llIllIIllIIlII();
    }

    private static boolean llIllIlIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        W var2;
        if (W.llIllIIlllllll(this.ck() ? 1 : 0)) {
            return lIlIIllIIIIl[0];
        }
        if (W.llIllIlIIIIIII(var2.co.G() ? 1 : 0)) {
            return lIlIIllIIIIl[0];
        }
        if (W.llIllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0) && W.llIllIlIIIIIII(Dialog.hasOption((String)lIlIIlIllIlI[lIlIIllIIIIl[0]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIllIIIIl[1]];
            stringArray[W.lIlIIllIIIIl[0]] = lIlIIlIllIlI[lIlIIllIIIIl[1]];
            Dialog.chooseOption((String[])stringArray);

            System.out.println("[StartRaid] Starting raid, layout: " + String.valueOf(aa.e()));
            return lIlIIllIIIIl[1];
        }
        Widget var3 = Widgets.get((int)lIlIIllIIIIl[2], (int)lIlIIllIIIIl[3]);
        if (W.llIllIlIIIIIIl(var3)) {
            System.out.println(lIlIIlIllIlI[lIlIIllIIIIl[4]]);
            return lIlIIllIIIIl[0];
        }
        this.co.b(s.ba());
        this.co.a(s.bc());
        this.co.c(s.bb());
        this.co.d(s.b(s.aZ()));
        var1_1.interact(lIlIIlIllIlI[lIlIIllIIIIl[5]]);
        this.sleep(this.cr.nextInt(lIlIIllIIIIl[4]) + lIlIIllIIIIl[1]);
        return lIlIIllIIIIl[1];
    }

    @Inject
    protected SettingUpRaidTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIlIIIIIIl(Object object) {
        return object == null;
    }
}

