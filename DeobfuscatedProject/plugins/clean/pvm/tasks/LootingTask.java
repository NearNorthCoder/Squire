/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.AHelper;
import gg.squire.pvm.tasks.CHelper;

@TaskDesc(name="Looting", priority=20, blocking=true)
public class LootingTask
extends Task {
    public static final  List<String> az;
    
    private final  SquireShamansPlugin aD;
    private final  SquireShamanConfig aB;
    private final  c aA;
    private final  a aC;
    private static final  Logger ay;

    private static boolean lIlIllllIlIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllllIlIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        TileItem var1;
        x var2;
        block12: {
            block10: {
                block11: {
                    void var3;
                    Player player = Players.getLocal();
                    if (x.lIlIllllIlIllIl(this.aB.room().LootingTask().contains((Locatable)player) ? 1 : 0)) {
                        this.aC.g(lIIllIIIlllII[0]);
                        return lIIllIIIlllII[0];
                    }
                    if (x.lIlIllllIlIlllI(var2.aD.j() ? 1 : 0)) {
                        return lIIllIIIlllII[0];
                    }
                    var1 = var2.aC.k().orElse(null);
                    if (x.lIlIllllIlIllll(var1)) {
                        var2.aC.g(lIIllIIIlllII[0]);
                        return lIIllIIIlllII[0];
                    }
                    if (x.lIlIllllIlIllIl(var2.aB.room().LootingTask().contains((Locatable)var1) ? 1 : 0)) {
                        var2.aC.g(lIIllIIIlllII[0]);
                        return lIIllIIIlllII[0];
                    }
                    NPC var4 = Combat.getAttackableNPC(arg_0 -> x.b((Player)var3, arg_0));
                    if (x.lIlIllllIllIIII(var4) && x.lIlIllllIlIlllI(var4.getWorldArea().contains((Locatable)var1) ? 1 : 0)) {
                        var2.aC.g(lIIllIIIlllII[0]);
                        return lIIllIIIlllII[0];
                    }
                    if (!x.lIlIllllIllIIIl(Prices.getItemPrice((int)var1.getId()) * var1.getQuantity(), var2.aB.lootValue())) break block10;
                    if (!x.lIlIllllIlIlllI(Inventory.isFull() ? 1 : 0)) break block11;
                    int[] nArray = new int[lIIllIIIlllII[1]];
                    nArray[x.lIIllIIIlllII[0]] = var1.getId();
                    if (!x.lIlIllllIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                }
                if (!x.lIlIllllIlIlllI(var1.isStackable() ? 1 : 0)) break block12;
            }
            var2.aC.g(lIIllIIIlllII[1]);
            if (x.lIlIllllIlIlllI(Inventory.isFull() ? 1 : 0)) {
                Item var5 = Inventory.getFirst(item -> {
                    String[] stringArray = new String[lIIllIIIlllII[1]];
                    stringArray[x.lIIllIIIlllII[0]] = lIIllIIIllIll[lIIllIIIlllII[3]];
                    return item.hasAction(stringArray);
                });
                var5.interact(lIIllIIIllIll[lIIllIIIlllII[0]]);
                return lIIllIIIlllII[1];
            }
            var1.interact(lIIllIIIllIll[lIIllIIIlllII[1]]);
            return lIIllIIIlllII[1];
        }
        if (x.lIlIllllIlIlllI(var2.aC.a(var1) ? 1 : 0) && x.lIlIllllIlIllIl(Inventory.isFull() ? 1 : 0)) {
            var2.aC.g(lIIllIIIlllII[1]);
            var1.interact(lIIllIIIllIll[lIIllIIIlllII[2]]);
            return lIIllIIIlllII[1];
        }
        this.aC.g(lIIllIIIlllII[0]);
        return lIIllIIIlllII[0];
    }

    private static boolean lIlIllllIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllllIllIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIllllIlIllll(Object object) {
        return object == null;
    }

    private static void lIlIllllIlIlIll() {
        lIIllIIIllIll = new String[lIIllIIIlllII[140]];
        x.lIIllIIIllIll[x.lIIllIIIlllII[0]] = "Eat";
        x.lIIllIIIllIll[x.lIIllIIIlllII[1]] = "Take";
        x.lIIllIIIllIll[x.lIIllIIIlllII[2]] = "Take";
        x.lIIllIIIllIll[x.lIIllIIIlllII[3]] = "Eat";
        x.lIIllIIIllIll[x.lIIllIIIlllII[4]] = "Lizardman";
        x.lIIllIIIllIll[x.lIIllIIIlllII[6]] = "Brimstone key";
        x.lIIllIIIllIll[x.lIIllIIIlllII[7]] = "Broad arrows";
        x.lIIllIIIllIll[x.lIIllIIIlllII[8]] = "Mystic earth staff";
        x.lIIllIIIllIll[x.lIIllIIIlllII[9]] = "Earth battlestaff";
        x.lIIllIIIllIll[x.lIIllIIIlllII[10]] = "Rune med helm";
        x.lIIllIIIllIll[x.lIIllIIIlllII[11]] = "Rune chainbody";
        x.lIIllIIIllIll[x.lIIllIIIlllII[12]] = "Rune warhammer";
        x.lIIllIIIllIll[x.lIIllIIIlllII[13]] = "Dragon warhammer";
        x.lIIllIIIllIll[x.lIIllIIIlllII[14]] = "Iron ore";
        x.lIIllIIIllIll[x.lIIllIIIlllII[15]] = "Coal";
        x.lIIllIIIllIll[x.lIIllIIIlllII[16]] = "Runite ore";
        x.lIIllIIIllIll[x.lIIllIIIlllII[17]] = "Grimy kwuarm";
        x.lIIllIIIllIll[x.lIIllIIIlllII[18]] = "Grimy dwarf weed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[19]] = "Grimy lantadyme";
        x.lIIllIIIllIll[x.lIIllIIIlllII[20]] = "Grimy cadantine";
        x.lIIllIIIllIll[x.lIIllIIIlllII[21]] = "Ranarr seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[22]] = "Snapdragon seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[23]] = "Torstol seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[24]] = "Maple seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[25]] = "Yew seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[26]] = "Magic seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[27]] = "Celastrus seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[28]] = "Onyx bolt tips";
        x.lIIllIIIllIll[x.lIIllIIIlllII[29]] = "Magic logs";
        x.lIIllIIIllIll[x.lIIllIIIlllII[30]] = "Redwood tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[31]] = "Dragonfruit tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[32]] = "Chaos rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[33]] = "Death rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[34]] = "Uncut ruby";
        x.lIIllIIIllIll[x.lIIllIIIlllII[35]] = "Uncut diamond";
        x.lIIllIIIllIll[x.lIIllIIIlllII[36]] = "Chilli potato";
        x.lIIllIIIllIll[x.lIIllIIIlllII[37]] = "Loop half of key";
        x.lIIllIIIllIll[x.lIIllIIIlllII[38]] = "Tooth half of key";
        x.lIIllIIIllIll[x.lIIllIIIlllII[39]] = "Diamond bolts (e)";
        x.lIIllIIIllIll[x.lIIllIIIlllII[40]] = "Runite bar";
        x.lIIllIIIllIll[x.lIIllIIIlllII[41]] = "Nature rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[42]] = "Rune 2h sword";
        x.lIIllIIIllIll[x.lIIllIIIlllII[43]] = "Rune battleaxe";
        x.lIIllIIIllIll[x.lIIllIIIlllII[44]] = "Law rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[45]] = "Rune 2h sword";
        x.lIIllIIIllIll[x.lIIllIIIlllII[46]] = "Blood rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[47]] = "Rune sq shield";
        x.lIIllIIIllIll[x.lIIllIIIlllII[48]] = "Dragonstone";
        x.lIIllIIIllIll[x.lIIllIIIlllII[49]] = "Silver ore";
        x.lIIllIIIllIll[x.lIIllIIIlllII[50]] = "Coins";
        x.lIIllIIIllIll[x.lIIllIIIlllII[51]] = "Treasonous ring";
        x.lIIllIIIllIll[x.lIIllIIIlllII[52]] = "Rune pickaxe";
        x.lIIllIIIllIll[x.lIIllIIIlllII[53]] = "Rune knife";
        x.lIIllIIIllIll[x.lIIllIIIlllII[54]] = "Rune kiteshield";
        x.lIIllIIIllIll[x.lIIllIIIlllII[55]] = "Dragon med helm";
        x.lIIllIIIllIll[x.lIIllIIIlllII[56]] = "Rune spear";
        x.lIIllIIIllIll[x.lIIllIIIlllII[57]] = "Shield left half";
        x.lIIllIIIllIll[x.lIIllIIIlllII[58]] = "Dragon spear";
        x.lIIllIIIllIll[x.lIIllIIIlllII[59]] = "Uncut diamond";
        x.lIIllIIIllIll[x.lIIllIIIlllII[60]] = "Ring of wealth";
        x.lIIllIIIllIll[x.lIIllIIIlllII[61]] = "Skills necklace";
        x.lIIllIIIllIll[x.lIIllIIIlllII[62]] = "Mahogany seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[63]] = "Palm tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[64]] = "Dragon pickaxe";
        x.lIIllIIIllIll[x.lIIllIIIlllII[65]] = "Dragon 2h sword";
        x.lIIllIIIllIll[x.lIIllIIIlllII[66]] = "Red spiders' eggs";
        x.lIIllIIIllIll[x.lIIllIIIlllII[67]] = "Unicorn horn";
        x.lIIllIIIllIll[x.lIIllIIIlllII[68]] = "Uncut dragonstone";
        x.lIIllIIIllIll[x.lIIllIIIlllII[69]] = "Grimy snapdragon";
        x.lIIllIIIllIll[x.lIIllIIIlllII[70]] = "Supercompost";
        x.lIIllIIIllIll[x.lIIllIIIlllII[71]] = "Cannonball";
        x.lIIllIIIllIll[x.lIIllIIIlllII[72]] = "Mysterious emblem";
        x.lIIllIIIllIll[x.lIIllIIIlllII[73]] = "Tanzanite fang";
        x.lIIllIIIllIll[x.lIIllIIIlllII[74]] = "Magic fang";
        x.lIIllIIIllIll[x.lIIllIIIlllII[75]] = "Serpentine visage";
        x.lIIllIIIllIll[x.lIIllIIIlllII[76]] = "Uncut onyx";
        x.lIIllIIIllIll[x.lIIllIIIlllII[77]] = "Dragon med helm";
        x.lIIllIIIllIll[x.lIIllIIIlllII[78]] = "Dragon halberd";
        x.lIIllIIIllIll[x.lIIllIIIlllII[79]] = "Law rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[80]] = "Pure essence";
        x.lIIllIIIllIll[x.lIIllIIIlllII[81]] = "Toadflax";
        x.lIIllIIIllIll[x.lIIllIIIlllII[82]] = "Snapdragon";
        x.lIIllIIIllIll[x.lIIllIIIlllII[83]] = "Dwarf weed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[84]] = "Torstol";
        x.lIIllIIIllIll[x.lIIllIIIlllII[85]] = "Flax";
        x.lIIllIIIllIll[x.lIIllIIIlllII[86]] = "Snakeskin";
        x.lIIllIIIllIll[x.lIIllIIIlllII[87]] = "Dragonstone bolt tips";
        x.lIIllIIIllIll[x.lIIllIIIlllII[88]] = "Yew logs";
        x.lIIllIIIllIll[x.lIIllIIIlllII[89]] = "Mahogany logs";
        x.lIIllIIIllIll[x.lIIllIIIlllII[90]] = "Coal";
        x.lIIllIIIllIll[x.lIIllIIIlllII[91]] = "Runite ore";
        x.lIIllIIIllIll[x.lIIllIIIlllII[92]] = "Calquat tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[93]] = "Palm tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[94]] = "Papaya tree seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[95]] = "Magic seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[96]] = "Toadflax seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[97]] = "Snapdragon seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[98]] = "Dwarf weed seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[99]] = "Torstol seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[100]] = "Crystal seed";
        x.lIIllIIIllIll[x.lIIllIIIlllII[101]] = "Dragon bones";
        x.lIIllIIIllIll[x.lIIllIIIlllII[102]] = "Coconut";
        x.lIIllIIIllIll[x.lIIllIIIlllII[103]] = "Grapes";
        x.lIIllIIIllIll[x.lIIllIIIlllII[104]] = "Battlestaff";
        x.lIIllIIIllIll[x.lIIllIIIlllII[105]] = "Manta ray";
        x.lIIllIIIllIll[x.lIIllIIIlllII[106]] = "Swamp tar";
        x.lIIllIIIllIll[x.lIIllIIIlllII[107]] = "Crushed nest";
        x.lIIllIIIllIll[x.lIIllIIIlllII[108]] = "Adamantite bar";
        x.lIIllIIIllIll[x.lIIllIIIlllII[109]] = "Uncut sapphire";
        x.lIIllIIIllIll[x.lIIllIIIlllII[110]] = "Uncut emerald";
        x.lIIllIIIllIll[x.lIIllIIIlllII[111]] = "Uncut ruby";
        x.lIIllIIIllIll[x.lIIllIIIlllII[112]] = "Chaos talisman";
        x.lIIllIIIllIll[x.lIIllIIIlllII[113]] = "Uncut diamond";
        x.lIIllIIIllIll[x.lIIllIIIlllII[114]] = "Rune javelin";
        x.lIIllIIIllIll[x.lIIllIIIlllII[115]] = "Loop half of key";
        x.lIIllIIIllIll[x.lIIllIIIlllII[116]] = "Tooth half of key";
        x.lIIllIIIllIll[x.lIIllIIIlllII[117]] = "Rune spear";
        x.lIIllIIIllIll[x.lIIllIIIlllII[118]] = "Shield left half";
        x.lIIllIIIllIll[x.lIIllIIIlllII[119]] = "Dragon spear";
        x.lIIllIIIllIll[x.lIIllIIIlllII[120]] = "Runite bar";
        x.lIIllIIIllIll[x.lIIllIIIlllII[121]] = "Dragonstone";
        x.lIIllIIIllIll[x.lIIllIIIlllII[122]] = "Silver ore";
        x.lIIllIIIllIll[x.lIIllIIIlllII[123]] = "Rune kiteshield";
        x.lIIllIIIllIll[x.lIIllIIIlllII[124]] = "Rune sq shield";
        x.lIIllIIIllIll[x.lIIllIIIlllII[125]] = "Rune battleaxe";
        x.lIIllIIIllIll[x.lIIllIIIlllII[126]] = "Rune 2h sword";
        x.lIIllIIIllIll[x.lIIllIIIlllII[127]] = "Nature rune";
        x.lIIllIIIllIll[x.lIIllIIIlllII[128]] = "Steel arrow";
        x.lIIllIIIllIll[x.lIIllIIIlllII[129]] = "Rune arrow";
        x.lIIllIIIllIll[x.lIIllIIIlllII[130]] = "Adamant javelin";
        x.lIIllIIIllIll[x.lIIllIIIlllII[131]] = "Rune javelin";
        x.lIIllIIIllIll[x.lIIllIIIlllII[132]] = "Jar of swamp";
        x.lIIllIIIllIll[x.lIIllIIIlllII[133]] = "Lizardman fang";
        x.lIIllIIIllIll[x.lIIllIIIlllII[134]] = "Red d'hide vamb";
        x.lIIllIIIllIll[x.lIIllIIIlllII[135]] = "Xeric's talisman (inert)";
        x.lIIllIIIllIll[x.lIIllIIIlllII[5]] = "Ancient shard";
        x.lIIllIIIllIll[x.lIIllIIIlllII[136]] = "Eternal gem";
        x.lIIllIIIllIll[x.lIIllIIIlllII[137]] = "Imbued heart";
        x.lIIllIIIllIll[x.lIIllIIIlllII[138]] = "Mist battlestaff";
        x.lIIllIIIllIll[x.lIIllIIIlllII[139]] = "Dust battlestaff";
    }

        return String.valueOf(var6);
    }

    private static boolean lIlIllllIllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        x.lIlIllllIlIllII();
        x.lIlIllllIlIlIll();
        ay = LoggerFactory.getLogger(LootingTask.class);
        String[] stringArray = new String[lIIllIIIlllII[5]];
        stringArray[x.lIIllIIIlllII[0]] = lIIllIIIllIll[lIIllIIIlllII[6]];
        stringArray[x.lIIllIIIlllII[1]] = lIIllIIIllIll[lIIllIIIlllII[7]];
        stringArray[x.lIIllIIIlllII[2]] = lIIllIIIllIll[lIIllIIIlllII[8]];
        stringArray[x.lIIllIIIlllII[3]] = lIIllIIIllIll[lIIllIIIlllII[9]];
        stringArray[x.lIIllIIIlllII[4]] = lIIllIIIllIll[lIIllIIIlllII[10]];
        stringArray[x.lIIllIIIlllII[6]] = lIIllIIIllIll[lIIllIIIlllII[11]];
        stringArray[x.lIIllIIIlllII[7]] = lIIllIIIllIll[lIIllIIIlllII[12]];
        stringArray[x.lIIllIIIlllII[8]] = lIIllIIIllIll[lIIllIIIlllII[13]];
        stringArray[x.lIIllIIIlllII[9]] = lIIllIIIllIll[lIIllIIIlllII[14]];
        stringArray[x.lIIllIIIlllII[10]] = lIIllIIIllIll[lIIllIIIlllII[15]];
        stringArray[x.lIIllIIIlllII[11]] = lIIllIIIllIll[lIIllIIIlllII[16]];
        stringArray[x.lIIllIIIlllII[12]] = lIIllIIIllIll[lIIllIIIlllII[17]];
        stringArray[x.lIIllIIIlllII[13]] = lIIllIIIllIll[lIIllIIIlllII[18]];
        stringArray[x.lIIllIIIlllII[14]] = lIIllIIIllIll[lIIllIIIlllII[19]];
        stringArray[x.lIIllIIIlllII[15]] = lIIllIIIllIll[lIIllIIIlllII[20]];
        stringArray[x.lIIllIIIlllII[16]] = lIIllIIIllIll[lIIllIIIlllII[21]];
        stringArray[x.lIIllIIIlllII[17]] = lIIllIIIllIll[lIIllIIIlllII[22]];
        stringArray[x.lIIllIIIlllII[18]] = lIIllIIIllIll[lIIllIIIlllII[23]];
        stringArray[x.lIIllIIIlllII[19]] = lIIllIIIllIll[lIIllIIIlllII[24]];
        stringArray[x.lIIllIIIlllII[20]] = lIIllIIIllIll[lIIllIIIlllII[25]];
        stringArray[x.lIIllIIIlllII[21]] = lIIllIIIllIll[lIIllIIIlllII[26]];
        stringArray[x.lIIllIIIlllII[22]] = lIIllIIIllIll[lIIllIIIlllII[27]];
        stringArray[x.lIIllIIIlllII[23]] = lIIllIIIllIll[lIIllIIIlllII[28]];
        stringArray[x.lIIllIIIlllII[24]] = lIIllIIIllIll[lIIllIIIlllII[29]];
        stringArray[x.lIIllIIIlllII[25]] = lIIllIIIllIll[lIIllIIIlllII[30]];
        stringArray[x.lIIllIIIlllII[26]] = lIIllIIIllIll[lIIllIIIlllII[31]];
        stringArray[x.lIIllIIIlllII[27]] = lIIllIIIllIll[lIIllIIIlllII[32]];
        stringArray[x.lIIllIIIlllII[28]] = lIIllIIIllIll[lIIllIIIlllII[33]];
        stringArray[x.lIIllIIIlllII[29]] = lIIllIIIllIll[lIIllIIIlllII[34]];
        stringArray[x.lIIllIIIlllII[30]] = lIIllIIIllIll[lIIllIIIlllII[35]];
        stringArray[x.lIIllIIIlllII[31]] = lIIllIIIllIll[lIIllIIIlllII[36]];
        stringArray[x.lIIllIIIlllII[32]] = lIIllIIIllIll[lIIllIIIlllII[37]];
        stringArray[x.lIIllIIIlllII[33]] = lIIllIIIllIll[lIIllIIIlllII[38]];
        stringArray[x.lIIllIIIlllII[34]] = lIIllIIIllIll[lIIllIIIlllII[39]];
        stringArray[x.lIIllIIIlllII[35]] = lIIllIIIllIll[lIIllIIIlllII[40]];
        stringArray[x.lIIllIIIlllII[36]] = lIIllIIIllIll[lIIllIIIlllII[41]];
        stringArray[x.lIIllIIIlllII[37]] = lIIllIIIllIll[lIIllIIIlllII[42]];
        stringArray[x.lIIllIIIlllII[38]] = lIIllIIIllIll[lIIllIIIlllII[43]];
        stringArray[x.lIIllIIIlllII[39]] = lIIllIIIllIll[lIIllIIIlllII[44]];
        stringArray[x.lIIllIIIlllII[40]] = lIIllIIIllIll[lIIllIIIlllII[45]];
        stringArray[x.lIIllIIIlllII[41]] = lIIllIIIllIll[lIIllIIIlllII[46]];
        stringArray[x.lIIllIIIlllII[42]] = lIIllIIIllIll[lIIllIIIlllII[47]];
        stringArray[x.lIIllIIIlllII[43]] = lIIllIIIllIll[lIIllIIIlllII[48]];
        stringArray[x.lIIllIIIlllII[44]] = lIIllIIIllIll[lIIllIIIlllII[49]];
        stringArray[x.lIIllIIIlllII[45]] = lIIllIIIllIll[lIIllIIIlllII[50]];
        stringArray[x.lIIllIIIlllII[46]] = lIIllIIIllIll[lIIllIIIlllII[51]];
        stringArray[x.lIIllIIIlllII[47]] = lIIllIIIllIll[lIIllIIIlllII[52]];
        stringArray[x.lIIllIIIlllII[48]] = lIIllIIIllIll[lIIllIIIlllII[53]];
        stringArray[x.lIIllIIIlllII[49]] = lIIllIIIllIll[lIIllIIIlllII[54]];
        stringArray[x.lIIllIIIlllII[50]] = lIIllIIIllIll[lIIllIIIlllII[55]];
        stringArray[x.lIIllIIIlllII[51]] = lIIllIIIllIll[lIIllIIIlllII[56]];
        stringArray[x.lIIllIIIlllII[52]] = lIIllIIIllIll[lIIllIIIlllII[57]];
        stringArray[x.lIIllIIIlllII[53]] = lIIllIIIllIll[lIIllIIIlllII[58]];
        stringArray[x.lIIllIIIlllII[54]] = lIIllIIIllIll[lIIllIIIlllII[59]];
        stringArray[x.lIIllIIIlllII[55]] = lIIllIIIllIll[lIIllIIIlllII[60]];
        stringArray[x.lIIllIIIlllII[56]] = lIIllIIIllIll[lIIllIIIlllII[61]];
        stringArray[x.lIIllIIIlllII[57]] = lIIllIIIllIll[lIIllIIIlllII[62]];
        stringArray[x.lIIllIIIlllII[58]] = lIIllIIIllIll[lIIllIIIlllII[63]];
        stringArray[x.lIIllIIIlllII[59]] = lIIllIIIllIll[lIIllIIIlllII[64]];
        stringArray[x.lIIllIIIlllII[60]] = lIIllIIIllIll[lIIllIIIlllII[65]];
        stringArray[x.lIIllIIIlllII[61]] = lIIllIIIllIll[lIIllIIIlllII[66]];
        stringArray[x.lIIllIIIlllII[62]] = lIIllIIIllIll[lIIllIIIlllII[67]];
        stringArray[x.lIIllIIIlllII[63]] = lIIllIIIllIll[lIIllIIIlllII[68]];
        stringArray[x.lIIllIIIlllII[64]] = lIIllIIIllIll[lIIllIIIlllII[69]];
        stringArray[x.lIIllIIIlllII[65]] = lIIllIIIllIll[lIIllIIIlllII[70]];
        stringArray[x.lIIllIIIlllII[66]] = lIIllIIIllIll[lIIllIIIlllII[71]];
        stringArray[x.lIIllIIIlllII[67]] = lIIllIIIllIll[lIIllIIIlllII[72]];
        stringArray[x.lIIllIIIlllII[68]] = lIIllIIIllIll[lIIllIIIlllII[73]];
        stringArray[x.lIIllIIIlllII[69]] = lIIllIIIllIll[lIIllIIIlllII[74]];
        stringArray[x.lIIllIIIlllII[70]] = lIIllIIIllIll[lIIllIIIlllII[75]];
        stringArray[x.lIIllIIIlllII[71]] = lIIllIIIllIll[lIIllIIIlllII[76]];
        stringArray[x.lIIllIIIlllII[72]] = lIIllIIIllIll[lIIllIIIlllII[77]];
        stringArray[x.lIIllIIIlllII[73]] = lIIllIIIllIll[lIIllIIIlllII[78]];
        stringArray[x.lIIllIIIlllII[74]] = lIIllIIIllIll[lIIllIIIlllII[79]];
        stringArray[x.lIIllIIIlllII[75]] = lIIllIIIllIll[lIIllIIIlllII[80]];
        stringArray[x.lIIllIIIlllII[76]] = lIIllIIIllIll[lIIllIIIlllII[81]];
        stringArray[x.lIIllIIIlllII[77]] = lIIllIIIllIll[lIIllIIIlllII[82]];
        stringArray[x.lIIllIIIlllII[78]] = lIIllIIIllIll[lIIllIIIlllII[83]];
        stringArray[x.lIIllIIIlllII[79]] = lIIllIIIllIll[lIIllIIIlllII[84]];
        stringArray[x.lIIllIIIlllII[80]] = lIIllIIIllIll[lIIllIIIlllII[85]];
        stringArray[x.lIIllIIIlllII[81]] = lIIllIIIllIll[lIIllIIIlllII[86]];
        stringArray[x.lIIllIIIlllII[82]] = lIIllIIIllIll[lIIllIIIlllII[87]];
        stringArray[x.lIIllIIIlllII[83]] = lIIllIIIllIll[lIIllIIIlllII[88]];
        stringArray[x.lIIllIIIlllII[84]] = lIIllIIIllIll[lIIllIIIlllII[89]];
        stringArray[x.lIIllIIIlllII[85]] = lIIllIIIllIll[lIIllIIIlllII[90]];
        stringArray[x.lIIllIIIlllII[86]] = lIIllIIIllIll[lIIllIIIlllII[91]];
        stringArray[x.lIIllIIIlllII[87]] = lIIllIIIllIll[lIIllIIIlllII[92]];
        stringArray[x.lIIllIIIlllII[88]] = lIIllIIIllIll[lIIllIIIlllII[93]];
        stringArray[x.lIIllIIIlllII[89]] = lIIllIIIllIll[lIIllIIIlllII[94]];
        stringArray[x.lIIllIIIlllII[90]] = lIIllIIIllIll[lIIllIIIlllII[95]];
        stringArray[x.lIIllIIIlllII[91]] = lIIllIIIllIll[lIIllIIIlllII[96]];
        stringArray[x.lIIllIIIlllII[92]] = lIIllIIIllIll[lIIllIIIlllII[97]];
        stringArray[x.lIIllIIIlllII[93]] = lIIllIIIllIll[lIIllIIIlllII[98]];
        stringArray[x.lIIllIIIlllII[94]] = lIIllIIIllIll[lIIllIIIlllII[99]];
        stringArray[x.lIIllIIIlllII[95]] = lIIllIIIllIll[lIIllIIIlllII[100]];
        stringArray[x.lIIllIIIlllII[96]] = lIIllIIIllIll[lIIllIIIlllII[101]];
        stringArray[x.lIIllIIIlllII[97]] = lIIllIIIllIll[lIIllIIIlllII[102]];
        stringArray[x.lIIllIIIlllII[98]] = lIIllIIIllIll[lIIllIIIlllII[103]];
        stringArray[x.lIIllIIIlllII[99]] = lIIllIIIllIll[lIIllIIIlllII[104]];
        stringArray[x.lIIllIIIlllII[100]] = lIIllIIIllIll[lIIllIIIlllII[105]];
        stringArray[x.lIIllIIIlllII[101]] = lIIllIIIllIll[lIIllIIIlllII[106]];
        stringArray[x.lIIllIIIlllII[102]] = lIIllIIIllIll[lIIllIIIlllII[107]];
        stringArray[x.lIIllIIIlllII[103]] = lIIllIIIllIll[lIIllIIIlllII[108]];
        stringArray[x.lIIllIIIlllII[104]] = lIIllIIIllIll[lIIllIIIlllII[109]];
        stringArray[x.lIIllIIIlllII[105]] = lIIllIIIllIll[lIIllIIIlllII[110]];
        stringArray[x.lIIllIIIlllII[106]] = lIIllIIIllIll[lIIllIIIlllII[111]];
        stringArray[x.lIIllIIIlllII[107]] = lIIllIIIllIll[lIIllIIIlllII[112]];
        stringArray[x.lIIllIIIlllII[108]] = lIIllIIIllIll[lIIllIIIlllII[113]];
        stringArray[x.lIIllIIIlllII[109]] = lIIllIIIllIll[lIIllIIIlllII[114]];
        stringArray[x.lIIllIIIlllII[110]] = lIIllIIIllIll[lIIllIIIlllII[115]];
        stringArray[x.lIIllIIIlllII[111]] = lIIllIIIllIll[lIIllIIIlllII[116]];
        stringArray[x.lIIllIIIlllII[112]] = lIIllIIIllIll[lIIllIIIlllII[117]];
        stringArray[x.lIIllIIIlllII[113]] = lIIllIIIllIll[lIIllIIIlllII[118]];
        stringArray[x.lIIllIIIlllII[114]] = lIIllIIIllIll[lIIllIIIlllII[119]];
        stringArray[x.lIIllIIIlllII[115]] = lIIllIIIllIll[lIIllIIIlllII[120]];
        stringArray[x.lIIllIIIlllII[116]] = lIIllIIIllIll[lIIllIIIlllII[121]];
        stringArray[x.lIIllIIIlllII[117]] = lIIllIIIllIll[lIIllIIIlllII[122]];
        stringArray[x.lIIllIIIlllII[118]] = lIIllIIIllIll[lIIllIIIlllII[123]];
        stringArray[x.lIIllIIIlllII[119]] = lIIllIIIllIll[lIIllIIIlllII[124]];
        stringArray[x.lIIllIIIlllII[120]] = lIIllIIIllIll[lIIllIIIlllII[125]];
        stringArray[x.lIIllIIIlllII[121]] = lIIllIIIllIll[lIIllIIIlllII[126]];
        stringArray[x.lIIllIIIlllII[122]] = lIIllIIIllIll[lIIllIIIlllII[127]];
        stringArray[x.lIIllIIIlllII[123]] = lIIllIIIllIll[lIIllIIIlllII[128]];
        stringArray[x.lIIllIIIlllII[124]] = lIIllIIIllIll[lIIllIIIlllII[129]];
        stringArray[x.lIIllIIIlllII[125]] = lIIllIIIllIll[lIIllIIIlllII[130]];
        stringArray[x.lIIllIIIlllII[126]] = lIIllIIIllIll[lIIllIIIlllII[131]];
        stringArray[x.lIIllIIIlllII[127]] = lIIllIIIllIll[lIIllIIIlllII[132]];
        stringArray[x.lIIllIIIlllII[128]] = lIIllIIIllIll[lIIllIIIlllII[133]];
        stringArray[x.lIIllIIIlllII[129]] = lIIllIIIllIll[lIIllIIIlllII[134]];
        stringArray[x.lIIllIIIlllII[130]] = lIIllIIIllIll[lIIllIIIlllII[135]];
        stringArray[x.lIIllIIIlllII[131]] = lIIllIIIllIll[lIIllIIIlllII[5]];
        stringArray[x.lIIllIIIlllII[132]] = lIIllIIIllIll[lIIllIIIlllII[136]];
        stringArray[x.lIIllIIIlllII[133]] = lIIllIIIllIll[lIIllIIIlllII[137]];
        stringArray[x.lIIllIIIlllII[134]] = lIIllIIIllIll[lIIllIIIlllII[138]];
        stringArray[x.lIIllIIIlllII[135]] = lIIllIIIllIll[lIIllIIIlllII[139]];
        az = Arrays.asList(stringArray);
    }

    private static boolean lIlIllllIllIIlI(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public LootingTask(SquireShamansPlugin squireShamansPlugin, c c2, SquireShamanConfig squireShamanConfig, a a2) {
        this.aD = squireShamansPlugin;
        this.aA = c2;
        this.aB = squireShamanConfig;
        this.aC = a2;
    }

    private static  boolean b(Player player, NPC nPC) {
        int n2;
        if (x.lIlIllllIlIlllI(nPC.getName().contains(lIIllIIIllIll[lIIllIIIlllII[4]]) ? 1 : 0) && x.lIlIllllIllIIlI(nPC.getInteracting(), player)) {
            n2 = lIIllIIIlllII[1];

            if (1 == 0) {
                return ((0x40 ^ 0x7E ^ (0x16 ^ 0x6E)) & (0xB4 ^ 0x81 ^ (0x31 ^ 0x42) ^ -1)) != 0;
            }
        } else {
            n2 = lIIllIIIlllII[0];
        }
        return n2 != 0;
    }
}

