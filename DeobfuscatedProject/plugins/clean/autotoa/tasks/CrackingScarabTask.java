/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

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
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;

@TaskDesc(name="Cracking scarab", priority=50)
public class CrackingScarabTask
extends AutotoaTaskBase {
    private final  C cB;
    private final  SquireAutoTOA cC;
    private  int cD;

    @Inject
    protected CrackingScarabTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cB = c2;
        this.cC = squireAutoTOA;
    }

    static {
        ac.lIIllIlIlllIII();
        ac.lIIllIlIIllIIl();
    }

    private static void lIIllIlIIllIIl() {
        lIllllIIlII = new String[lIllllIllll[3]];
        ac.lIllllIIlII[ac.lIllllIllll[1]] = "Crack";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (ac.lIIllIlIlllIIl(this.cu.getTickCount() - this.cD, lIllllIllll[0])) {
            return lIllllIllll[1];
        }
        if (ac.lIIllIlIlllIIl(Skills.getLevel((Skill)Skill.PRAYER) - Skills.getBoostedLevel((Skill)Skill.PRAYER), lIllllIllll[2])) {
            return lIllllIllll[1];
        }
        Item var1 = Inventory.getFirst(item -> e.BLESSED_CRYSTAL_SCARAB.d(item.getId()));
        if (ac.lIIllIlIlllIlI(var1)) {
            return lIllllIllll[1];
        }
        var1_1.interact(lIllllIIlII[lIllllIllll[1]]);
        this.cD = this.cu.getTickCount();
        return lIllllIllll[3];
    }

    private static boolean lIIllIlIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIlIlllIlI(Object object) {
        return object == null;
    }

}

