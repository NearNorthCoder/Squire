/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking p1 warden", priority=10)
public class AttackingP1WardenTask
extends AutotoaTaskBase {

    @Inject
    protected AttackingP1WardenTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIlIlIllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIlIlllIlI(Object object) {
        return object == null;
    }

    private static void lIlIlIlIIlIlIl() {
        llIllIllIIl = new String[llIlllIIIlI[8]];
        bF.llIllIllIIl[bF.llIlllIIIlI[0]] = "Attack";
        bF.llIllIllIIl[bF.llIlllIIIlI[1]] = "Attack";
        bF.llIllIllIIl[bF.llIlllIIIlI[3]] = "Elidinis' Warden";
    }

    private static boolean lIlIlIlIlllIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var1;
        NPC nPC = this.co();
        if (bF.lIlIlIlIlllIlI(nPC)) {
            return llIlllIIIlI[0];
        }
        String[] stringArray = new String[llIlllIIIlI[1]];
        stringArray[bF.llIlllIIIlI[0]] = llIllIllIIl[llIlllIIIlI[0]];
        if (bF.lIlIlIlIlllIll(var1.hasAction(stringArray) ? 1 : 0)) {
            return llIlllIIIlI[0];
        }
        this.bp();
        this.aY.a(llIlllIIIlI[2]);
        nPC.interact(llIllIllIIl[llIlllIIIlI[1]]);
        return llIlllIIIlI[1];
    }

    static {
        bF.lIlIlIlIlllIIl();
        bF.lIlIlIlIIlIlIl();
    }

    private static boolean lIlIlIlIllllII(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        bF var2;
        void var3;
        String[] stringArray = new String[llIlllIIIlI[1]];
        stringArray[bF.llIlllIIIlI[0]] = llIllIllIIl[llIlllIIIlI[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bF.lIlIlIlIlllIlI(nPC)) {
            return this.cW.mageP2Warden();
        }
        int var4 = var3.getId();
        if (!bF.lIlIlIlIllllII(var4, llIlllIIIlI[4]) || bF.lIlIlIlIllllIl(var4, llIlllIIIlI[5])) {
            return var2.cW.rangedP2Warden();
        }
        if (!bF.lIlIlIlIllllII(var4, llIlllIIIlI[6]) || bF.lIlIlIlIllllIl(var4, llIlllIIIlI[7])) {
            return var2.cW.mageP2Warden();
        }
        return this.cW.mageP2Warden();
    }
}

