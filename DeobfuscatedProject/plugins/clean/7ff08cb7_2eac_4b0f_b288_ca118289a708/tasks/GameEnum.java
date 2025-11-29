/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i CAMEL_5;
    public static final  /* enum */ i SNAIL_5;
    public static final  /* enum */ i KALPHITE_2;
    public static final  /* enum */ i WYVERN_1;
    public static final  /* enum */ i KALPHITE_4;
    public static final  /* enum */ i SLUG_6;
    public static final  /* enum */ i TORTOISE_3;
    public static final  /* enum */ i TERRORBIRD_3;
    public static final  /* enum */ i SNAIL_4;
    public static final  /* enum */ i PENGUIN_5;
    public static final  /* enum */ i MOLE_2;
    public static final  /* enum */ i MOLE_4;
    public static final  /* enum */ i LIZARD_3;
    public static final  /* enum */ i LIZARD_2;
    public static final  /* enum */ i TORTOISE_5;
    
    public static final  /* enum */ i KALPHITE_6;
    public static final  /* enum */ i SNAKE_3;
    public static final  /* enum */ i CAMEL_2;
    public static final  /* enum */ i DRAGON_1;
    public static final  /* enum */ i LIZARD_6;
    public static final  /* enum */ i SLUG_4;
    public static final  /* enum */ i SLUG_1;
    public static final  /* enum */ i TORTOISE_1;
    public static final  /* enum */ i PENGUIN_2;
    public static final  /* enum */ i MONKEY_1;
    public static final  /* enum */ i WYVERN_2;
    public static final  /* enum */ i SLUG_3;
    public static final  /* enum */ i LEECH_6;
    public static final  /* enum */ i DRAGON_2;
    public static final  /* enum */ i WYVERN_4;
    public static final  /* enum */ i MONKEY_6;
    public static final  /* enum */ i SNAIL_3;
    public static final  /* enum */ i LEECH_5;
    public static final  /* enum */ i PENGUIN_3;
    private final  String question;
    
    public static final  /* enum */ i CAMEL_4;
    public static final  /* enum */ i DRAGON_3;
    public static final  /* enum */ i PENGUIN_6;
    public static final  /* enum */ i MONKEY_3;
    private static final  i[] $VALUES;
    public static final  /* enum */ i TORTOISE_2;
    public static final  /* enum */ i LEECH_4;
    public static final  /* enum */ i SNAIL_6;
    public static final  /* enum */ i SLUG_2;
    public static final  /* enum */ i CAMEL_6;
    public static final  /* enum */ i PENGUIN_4;
    private final  String answer;
    public static final  /* enum */ i LEECH_3;
    public static final  /* enum */ i TERRORBIRD_4;
    public static final  /* enum */ i TERRORBIRD_5;
    public static final  /* enum */ i SNAKE_2;
    public static final  /* enum */ i WYVERN_5;
    public static final  /* enum */ i LIZARD_1;
    public static final  /* enum */ i TERRORBIRD_1;
    public static final  /* enum */ i TORTOISE_4;
    public static final  /* enum */ i LEECH_1;
    public static final  /* enum */ i TERRORBIRD_6;
    public static final  /* enum */ i KALPHITE_5;
    public static final  /* enum */ i MOLE_6;
    public static final  /* enum */ i LIZARD_4;
    public static final  /* enum */ i MONKEY_4;
    public static final  /* enum */ i SNAIL_1;
    public static final  /* enum */ i TORTOISE_6;
    public static final  /* enum */ i MOLE_5;
    public static final  /* enum */ i KALPHITE_1;
    public static final  /* enum */ i SNAIL_2;
    public static final  /* enum */ i SNAKE_1;
    public static final  /* enum */ i LEECH_2;
    public static final  /* enum */ i DRAGON_5;
    public static final  /* enum */ i DRAGON_4;
    public static final  /* enum */ i LIZARD_5;
    public static final  /* enum */ i DRAGON_6;
    public static final  /* enum */ i MOLE_1;
    public static final  /* enum */ i SNAKE_6;
    public static final  /* enum */ i SNAKE_4;
    public static final  /* enum */ i WYVERN_6;
    public static final  /* enum */ i TERRORBIRD_2;
    public static final  /* enum */ i CAMEL_1;
    public static final  /* enum */ i MOLE_3;
    public static final  /* enum */ i KALPHITE_3;
    public static final  /* enum */ i SLUG_5;
    public static final  /* enum */ i MONKEY_2;
    public static final  /* enum */ i CAMEL_3;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ i WYVERN_3;
    public static final  /* enum */ i SNAKE_5;
    public static final  /* enum */ i MONKEY_5;
    public static final  /* enum */ i PENGUIN_1;

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    public String aa() {
        return this.question;
    }

    private static boolean llIllIIIllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void lIlIIlIIIllIl;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int lIlIIlIIIllII = llllllllI[0];
        while (i.llIllIIIlllI(lIlIIlIIIllII, (int)lIlIIlIIIllIl)) {
            void lIlIIlIIIllll;
            void lIlIIlIIIlllI;
            void lIlIIlIIIlIll = lIlIIlIIIlllI[lIlIIlIIIllII];
            Widget lIlIIlIIIlIlI = Widgets.get((WidgetInfo)lIlIIlIIIlIll);
            if (i.llIllIIIllll(lIlIIlIIIlIlI) && i.llIllIIlIIII(lIlIIlIIIlIlI.getText().equals(lIlIIlIIIllll) ? 1 : 0)) {
                return lIlIIlIIIlIlI;
            }
            ++lIlIIlIIIllII;

            if ((0x22 ^ 0x79 ^ (0xFB ^ 0xA5)) > 0) continue;
            return null;
        }
        return null;
    }

    private static void llIllIIIllII() {
        llllllIIl = new String[llllllllI[252]];
        i.llllllIIl[i.llllllllI[0]] = "LIZARD_1";
        i.llllllIIl[i.llllllllI[1]] = "How does a lizard regulate body heat?";
        i.llllllIIl[i.llllllllI[2]] = "Sunlight.";
        i.llllllIIl[i.llllllllI[3]] = "LIZARD_2";
        i.llllllIIl[i.llllllllI[4]] = "Who discovered how to kill lizards?";
        i.llllllIIl[i.llllllllI[5]] = "The Slayer Masters.";
        i.llllllIIl[i.llllllllI[6]] = "LIZARD_3";
        i.llllllIIl[i.llllllllI[7]] = "How many eyes does a lizard have?";
        i.llllllIIl[i.llllllllI[8]] = "Three.";
        i.llllllIIl[i.llllllllI[9]] = "LIZARD_4";
        i.llllllIIl[i.llllllllI[10]] = "What order do lizards belong to?";
        i.llllllIIl[i.llllllllI[11]] = "Squamata.";
        i.llllllIIl[i.llllllllI[12]] = "LIZARD_5";
        i.llllllIIl[i.llllllllI[13]] = "What happens when a lizard becomes cold?";
        i.llllllIIl[i.llllllllI[14]] = "It becomes sleepy.";
        i.llllllIIl[i.llllllllI[15]] = "LIZARD_6";
        i.llllllIIl[i.llllllllI[16]] = "Lizard skin is made of the same substance as?";
        i.llllllIIl[i.llllllllI[17]] = "Hair.";
        i.llllllIIl[i.llllllllI[18]] = "TORTOISE_1";
        i.llllllIIl[i.llllllllI[19]] = "What is the name of the oldest tortoise ever recorded?";
        i.llllllIIl[i.llllllllI[20]] = "Mibbiwocket.";
        i.llllllIIl[i.llllllllI[21]] = "TORTOISE_2";
        i.llllllIIl[i.llllllllI[22]] = "What is a tortoise's favourite food?";
        i.llllllIIl[i.llllllllI[23]] = "Vegetables.";
        i.llllllIIl[i.llllllllI[24]] = "TORTOISE_3";
        i.llllllIIl[i.llllllllI[25]] = "Name the explorer who discovered the world's oldest tortoise.";
        i.llllllIIl[i.llllllllI[26]] = "Admiral Bake.";
        i.llllllIIl[i.llllllllI[27]] = "TORTOISE_4";
        i.llllllIIl[i.llllllllI[28]] = "How does the tortoise protect itself?";
        i.llllllIIl[i.llllllllI[29]] = "Hard shell.";
        i.llllllIIl[i.llllllllI[30]] = "TORTOISE_5";
        i.llllllIIl[i.llllllllI[31]] = "If a tortoise had twenty rings on its shell, how old would it be?";
        i.llllllIIl[i.llllllllI[32]] = "Twenty years.";
        i.llllllIIl[i.llllllllI[33]] = "TORTOISE_6";
        i.llllllIIl[i.llllllllI[34]] = "Which race breeds tortoises for battle?";
        i.llllllIIl[i.llllllllI[35]] = "Gnomes.";
        i.llllllIIl[i.llllllllI[36]] = "DRAGON_1";
        i.llllllIIl[i.llllllllI[37]] = "What is considered a delicacy by dragons?";
        i.llllllIIl[i.llllllllI[38]] = "Runite.";
        i.llllllIIl[i.llllllllI[39]] = "DRAGON_2";
        i.llllllIIl[i.llllllllI[40]] = "What is the best defence against a dragon's attack?";
        i.llllllIIl[i.llllllllI[41]] = "Anti dragon-breath shield.";
        i.llllllIIl[i.llllllllI[42]] = "DRAGON_3";
        i.llllllIIl[i.llllllllI[43]] = "How long do dragons live?";
        i.llllllIIl[i.llllllllI[44]] = "Unknown.";
        i.llllllIIl[i.llllllllI[45]] = "DRAGON_4";
        i.llllllIIl[i.llllllllI[46]] = "Which of these is not a type of dragon?";
        i.llllllIIl[i.llllllllI[47]] = "Elemental.";
        i.llllllIIl[i.llllllllI[48]] = "DRAGON_5";
        i.llllllIIl[i.llllllllI[49]] = "What is the favoured territory of a dragon?";
        i.llllllIIl[i.llllllllI[50]] = "Old battle sites.";
        i.llllllIIl[i.llllllllI[51]] = "DRAGON_6";
        i.llllllIIl[i.llllllllI[52]] = "Approximately how many feet tall do dragons stand?";
        i.llllllIIl[i.llllllllI[53]] = "Twelve.";
        i.llllllIIl[i.llllllllI[54]] = "WYVERN_1";
        i.llllllIIl[i.llllllllI[55]] = "How did the wyverns die out?";
        i.llllllIIl[i.llllllllI[56]] = "Climate change.";
        i.llllllIIl[i.llllllllI[57]] = "N21:/3X|";
        i.llllllIIl[i.llllllllI[58]] = "How many legs does a wyvern have?";
        i.llllllIIl[i.llllllllI[59]] = "Two.";
        i.llllllIIl[i.llllllllI[60]] = "WYVERN_3";
        i.llllllIIl[i.llllllllI[61]] = "Where have wyvern bones been found?";
        i.llllllIIl[i.llllllllI[62]] = "Asgarnia.";
        i.llllllIIl[i.llllllllI[63]] = "WYVERN_4";
        i.llllllIIl[i.llllllllI[64]] = "Which genus does the wyvern theoretically belong to?";
        i.llllllIIl[i.llllllllI[65]] = "Reptiles.";
        i.llllllIIl[i.llllllllI[66]] = "WYVERN_5";
        i.llllllIIl[i.llllllllI[67]] = "What are the wyverns' closest relations?";
        i.llllllIIl[i.llllllllI[68]] = "Dragons.";
        i.llllllIIl[i.llllllllI[69]] = "WYVERN_6";
        i.llllllIIl[i.llllllllI[70]] = "What is the ambient temperature of wyvern bones?";
        i.llllllIIl[i.llllllllI[71]] = "Below room temperature.";
        i.llllllIIl[i.llllllllI[72]] = "SNAIL_1";
        i.llllllIIl[i.llllllllI[73]] = "What is special about the shell of the giant Morytanian snail?";
        i.llllllIIl[i.llllllllI[74]] = "It is resistant to acid.";
        i.llllllIIl[i.llllllllI[75]] = "SNAIL_2";
        i.llllllIIl[i.llllllllI[76]] = "How do Morytanian snails capture their prey?";
        i.llllllIIl[i.llllllllI[77]] = "Spitting acid.";
        i.llllllIIl[i.llllllllI[78]] = "SNAIL_3";
        i.llllllIIl[i.llllllllI[79]] = "Which of these is a snail byproduct?";
        i.llllllIIl[i.llllllllI[80]] = "Fireproof oil.";
        i.llllllIIl[i.llllllllI[81]] = "SNAIL_4";
        i.llllllIIl[i.llllllllI[82]] = "What does 'Achatina Acidia' mean?";
        i.llllllIIl[i.llllllllI[83]] = "Acid-spitting snail.";
        i.llllllIIl[i.llllllllI[84]] = "SNAIL_5";
        i.llllllIIl[i.llllllllI[85]] = "How do snails move?";
        i.llllllIIl[i.llllllllI[86]] = "Contracting and stretching.";
        i.llllllIIl[i.llllllllI[87]] = "SNAIL_6";
        i.llllllIIl[i.llllllllI[88]] = "What is the 'trapdoor', which snails use to cover the entrance to their shells called?";
        i.llllllIIl[i.llllllllI[89]] = "An operculum.";
        i.llllllIIl[i.llllllllI[90]] = "SNAKE_1";
        i.llllllIIl[i.llllllllI[91]] = "What is snake venom adapted from?";
        i.llllllIIl[i.llllllllI[92]] = "Stomach acid.";
        i.llllllIIl[i.llllllllI[93]] = "SNAKE_2";
        i.llllllIIl[i.llllllllI[94]] = "Aside from their noses, what do snakes use to smell?";
        i.llllllIIl[i.llllllllI[95]] = "Tongue.";
        i.llllllIIl[i.llllllllI[96]] = "SNAKE_3";
        i.llllllIIl[i.llllllllI[97]] = "If a snake sticks its tongue out at you, what is it doing?";
        i.llllllIIl[i.llllllllI[98]] = "Seeing how you smell.";
        i.llllllIIl[i.llllllllI[99]] = "SNAKE_4";
        i.llllllIIl[i.llllllllI[100]] = "If some snakes use venom to kill their prey, what do other snakes use?";
        i.llllllIIl[i.llllllllI[101]] = "Constriction.";
        i.llllllIIl[i.llllllllI[102]] = "SNAKE_5";
        i.llllllIIl[i.llllllllI[103]] = "Lizards and snakes belong to the same order - what is it?";
        i.llllllIIl[i.llllllllI[104]] = "Squamata.";
        i.llllllIIl[i.llllllllI[105]] = "SNAKE_6";
        i.llllllIIl[i.llllllllI[106]] = "Which habitat do snakes prefer?";
        i.llllllIIl[i.llllllllI[107]] = "Anywhere.";
        i.llllllIIl[i.llllllllI[108]] = "SLUG_1";
        i.llllllIIl[i.llllllllI[109]] = "We assume that sea slugs have a stinging organ on their soft skin - what is it called?";
        i.llllllIIl[i.llllllllI[110]] = "Nematocysts.";
        i.llllllIIl[i.llllllllI[111]] = "SLUG_2";
        i.llllllIIl[i.llllllllI[112]] = "Why has the museum never examined a live sea slug?";
        i.llllllIIl[i.llllllllI[113]] = "The researchers keep vanishing.";
        i.llllllIIl[i.llllllllI[114]] = "SLUG_3";
        i.llllllIIl[i.llllllllI[115]] = "What do we think the sea slug feeds upon?";
        i.llllllIIl[i.llllllllI[116]] = "Seaweed.";
        i.llllllIIl[i.llllllllI[117]] = "SLUG_4";
        i.llllllIIl[i.llllllllI[118]] = "What are the two fangs presumed to be used for?";
        i.llllllIIl[i.llllllllI[119]] = "Defense or display.";
        i.llllllIIl[i.llllllllI[120]] = "SLUG_5";
        i.llllllIIl[i.llllllllI[121]] = "Off of which coastline would you find sea slugs?";
        i.llllllIIl[i.llllllllI[122]] = "Ardougne.";
        i.llllllIIl[i.llllllllI[123]] = "SLUG_6";
        i.llllllIIl[i.llllllllI[124]] = "In what way are sea slugs similar to snails?";
        i.llllllIIl[i.llllllllI[125]] = "They have a hard shell.";
        i.llllllIIl[i.llllllllI[126]] = "MONKEY_1";
        i.llllllIIl[i.llllllllI[127]] = "Which type of primates do monkeys belong to?";
        i.llllllIIl[i.llllllllI[128]] = "Simian.";
        i.llllllIIl[i.llllllllI[129]] = "MONKEY_2";
        i.llllllIIl[i.llllllllI[130]] = "Which have the lighter colour: Karamjan or Harmless monkeys?";
        i.llllllIIl[i.llllllllI[131]] = "Harmless.";
        i.llllllIIl[i.llllllllI[132]] = "MONKEY_3";
        i.llllllIIl[i.llllllllI[133]] = "Monkeys love bananas. What else do they like to eat?";
        i.llllllIIl[i.llllllllI[134]] = "Bitternuts.";
        i.llllllIIl[i.llllllllI[135]] = "MONKEY_4";
        i.llllllIIl[i.llllllllI[136]] = "There are two known families of monkeys. One is Karamjan, the other is...?";
        i.llllllIIl[i.llllllllI[137]] = "Harmless.";
        i.llllllIIl[i.llllllllI[138]] = "MONKEY_5";
        i.llllllIIl[i.llllllllI[139]] = "What colour mohawk do Karamjan monkeys have?";
        i.llllllIIl[i.llllllllI[140]] = "Red.";
        i.llllllIIl[i.llllllllI[141]] = "MONKEY_6";
        i.llllllIIl[i.llllllllI[142]] = "What have Karamjan monkeys taken a deep dislike to?";
        i.llllllIIl[i.llllllllI[143]] = "Seaweed.";
        i.llllllIIl[i.llllllllI[144]] = "KALPHITE_1";
        i.llllllIIl[i.llllllllI[145]] = "Kalphites are ruled by a...?";
        i.llllllIIl[i.llllllllI[146]] = "Pasha.";
        i.llllllIIl[i.llllllllI[147]] = "KALPHITE_2";
        i.llllllIIl[i.llllllllI[148]] = "What is the lowest caste in kalphite society?";
        i.llllllIIl[i.llllllllI[149]] = "Worker.";
        i.llllllIIl[i.llllllllI[150]] = "KALPHITE_3";
        i.llllllIIl[i.llllllllI[151]] = "What are the armoured plates on a kalphite called?";
        i.llllllIIl[i.llllllllI[152]] = "Lamellae.";
        i.llllllIIl[i.llllllllI[153]] = "KALPHITE_4";
        i.llllllIIl[i.llllllllI[154]] = "Are kalphites carnivores, herbivores or omnivores?";
        i.llllllIIl[i.llllllllI[155]] = "Carnivores.";
        i.llllllIIl[i.llllllllI[156]] = "KALPHITE_5";
        i.llllllIIl[i.llllllllI[157]] = "What are kalphites assumed to have evolved from?";
        i.llllllIIl[i.llllllllI[158]] = "Scarab beetles.";
        i.llllllIIl[i.llllllllI[159]] = "KALPHITE_6";
        i.llllllIIl[i.llllllllI[160]] = "Name the prominent figure in kalphite mythology?";
        i.llllllIIl[i.llllllllI[161]] = "Scabaras.";
        i.llllllIIl[i.llllllllI[162]] = "TERRORBIRD_1";
        i.llllllIIl[i.llllllllI[163]] = "What is a terrorbird's preferred food?";
        i.llllllIIl[i.llllllllI[164]] = "Anything.";
        i.llllllIIl[i.llllllllI[165]] = "TERRORBIRD_2";
        i.llllllIIl[i.llllllllI[166]] = "Who use terrorbirds as mounts?";
        i.llllllIIl[i.llllllllI[167]] = "Gnomes.";
        i.llllllIIl[i.llllllllI[168]] = "TERRORBIRD_3";
        i.llllllIIl[i.llllllllI[169]] = "Where do terrorbirds get most of their water?";
        i.llllllIIl[i.llllllllI[170]] = "Eating plants.";
        i.llllllIIl[i.llllllllI[171]] = "TERRORBIRD_4";
        i.llllllIIl[i.llllllllI[172]] = "How many claws do terrorbirds have?";
        i.llllllIIl[i.llllllllI[173]] = "Four.";
        i.llllllIIl[i.llllllllI[174]] = "TERRORBIRD_5";
        i.llllllIIl[i.llllllllI[175]] = "What do terrorbirds eat to aid digestion?";
        i.llllllIIl[i.llllllllI[176]] = "Stones.";
        i.llllllIIl[i.llllllllI[177]] = "TERRORBIRD_6";
        i.llllllIIl[i.llllllllI[178]] = "How many teeth do terrorbirds have?";
        i.llllllIIl[i.llllllllI[179]] = "0.";
        i.llllllIIl[i.llllllllI[180]] = "PENGUIN_1";
        i.llllllIIl[i.llllllllI[181]] = "Which sense do penguins rely on when hunting?";
        i.llllllIIl[i.llllllllI[182]] = "Sight.";
        i.llllllIIl[i.llllllllI[183]] = "PENGUIN_2";
        i.llllllIIl[i.llllllllI[184]] = "Which skill seems unusual for the penguins to possess?";
        i.llllllIIl[i.llllllllI[185]] = "Planning.";
        i.llllllIIl[i.llllllllI[186]] = "PENGUIN_3";
        i.llllllIIl[i.llllllllI[187]] = "How do penguins keep warm?";
        i.llllllIIl[i.llllllllI[188]] = "A layer of fat.";
        i.llllllIIl[i.llllllllI[189]] = "PENGUIN_4";
        i.llllllIIl[i.llllllllI[190]] = "What is the preferred climate for penguins?";
        i.llllllIIl[i.llllllllI[191]] = "Cold.";
        i.llllllIIl[i.llllllllI[192]] = "PENGUIN_5";
        i.llllllIIl[i.llllllllI[193]] = "Describe the behaviour of penguins?";
        i.llllllIIl[i.llllllllI[194]] = "Social.";
        i.llllllIIl[i.llllllllI[195]] = "PENGUIN_6";
        i.llllllIIl[i.llllllllI[196]] = "When do penguins fast?";
        i.llllllIIl[i.llllllllI[197]] = "During breeding.";
        i.llllllIIl[i.llllllllI[198]] = "MOLE_1";
        i.llllllIIl[i.llllllllI[199]] = "What habitat do moles prefer?";
        i.llllllIIl[i.llllllllI[200]] = "Subterranean.";
        i.llllllIIl[i.llllllllI[201]] = "MOLE_2";
        i.llllllIIl[i.llllllllI[202]] = "Why are moles considered to be an agricultural pest?";
        i.llllllIIl[i.llllllllI[203]] = "They dig holes.";
        i.llllllIIl[i.llllllllI[204]] = "MOLE_3";
        i.llllllIIl[i.llllllllI[205]] = "Who discovered giant moles?";
        i.llllllIIl[i.llllllllI[206]] = "Wyson the Gardener.";
        i.llllllIIl[i.llllllllI[207]] = "MOLE_4";
        i.llllllIIl[i.llllllllI[208]] = "What would you call a group of young moles?";
        i.llllllIIl[i.llllllllI[209]] = "A labour.";
        i.llllllIIl[i.llllllllI[210]] = "MOLE_5";
        i.llllllIIl[i.llllllllI[211]] = "What is a mole's favourite food?";
        i.llllllIIl[i.llllllllI[212]] = "Insects and other invertebrates.";
        i.llllllIIl[i.llllllllI[213]] = "MOLE_6";
        i.llllllIIl[i.llllllllI[214]] = "Which family do moles belong to?";
        i.llllllIIl[i.llllllllI[215]] = "The Talpidae family.";
        i.llllllIIl[i.llllllllI[216]] = "CAMEL_1";
        i.llllllIIl[i.llllllllI[217]] = "What is produced by feeding chilli to a camel?";
        i.llllllIIl[i.llllllllI[218]] = "Toxic dung.";
        i.llllllIIl[i.llllllllI[219]] = "CAMEL_2";
        i.llllllIIl[i.llllllllI[220]] = "If an ugthanki has one, how many does a bactrian have?";
        i.llllllIIl[i.llllllllI[221]] = "Two.";
        i.llllllIIl[i.llllllllI[222]] = "CAMEL_3";
        i.llllllIIl[i.llllllllI[223]] = "Camels: herbivore, carnivore or omnivore?";
        i.llllllIIl[i.llllllllI[224]] = "Omnivore.";
        i.llllllIIl[i.llllllllI[225]] = "CAMEL_4";
        i.llllllIIl[i.llllllllI[226]] = "What is the usual mood for a camel?";
        i.llllllIIl[i.llllllllI[227]] = "Annoyed.";
        i.llllllIIl[i.llllllllI[228]] = "CAMEL_5";
        i.llllllIIl[i.llllllllI[229]] = "Where would you find an ugthanki?";
        i.llllllIIl[i.llllllllI[230]] = "Al Kharid.";
        i.llllllIIl[i.llllllllI[231]] = "CAMEL_6";
        i.llllllIIl[i.llllllllI[232]] = "Which camel byproduct is known to be very nutritious?";
        i.llllllIIl[i.llllllllI[233]] = "Milk.";
        i.llllllIIl[i.llllllllI[234]] = "LEECH_1";
        i.llllllIIl[i.llllllllI[235]] = "What is the favoured habitat of leeches?";
        i.llllllIIl[i.llllllllI[236]] = "Water.";
        i.llllllIIl[i.llllllllI[237]] = "LEECH_2";
        i.llllllIIl[i.llllllllI[238]] = "What shape is the inside of a leech's mouth?";
        i.llllllIIl[i.llllllllI[239]] = "'Y'-shaped.";
        i.llllllIIl[i.llllllllI[240]] = "LEECH_3";
        i.llllllIIl[i.llllllllI[241]] = "Which of these is not eaten by leeches?";
        i.llllllIIl[i.llllllllI[242]] = "Apples.";
        i.llllllIIl[i.llllllllI[243]] = "LEECH_4";
        i.llllllIIl[i.llllllllI[244]] = "What contributed to the giant growth of Morytanian leeches?";
        i.llllllIIl[i.llllllllI[245]] = "Environment.";
        i.llllllIIl[i.llllllllI[246]] = "LEECH_5";
        i.llllllIIl[i.llllllllI[247]] = "What is special about Morytanian leeches?";
        i.llllllIIl[i.llllllllI[248]] = "They attack by jumping.";
        i.llllllIIl[i.llllllllI[249]] = "LEECH_6";
        i.llllllIIl[i.llllllllI[250]] = "How does a leech change when it feeds?";
        i.llllllIIl[i.llllllllI[251]] = "It doubles in size.";
    }

    private static boolean llIllIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIlIIII(int n2) {
        return n2 != 0;
    }

    public String ab() {
        return this.answer;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void lIlIIlIIIIIlI;
            i.llIllIIIllIl();
            i.llIllIIIllII();
            LIZARD_1 = new GameEnum(llllllIIl[llllllllI[1]], llllllIIl[llllllllI[2]]);
            LIZARD_2 = new GameEnum(llllllIIl[llllllllI[4]], llllllIIl[llllllllI[5]]);
            LIZARD_3 = new GameEnum(llllllIIl[llllllllI[7]], llllllIIl[llllllllI[8]]);
            LIZARD_4 = new GameEnum(llllllIIl[llllllllI[10]], llllllIIl[llllllllI[11]]);
            LIZARD_5 = new GameEnum(llllllIIl[llllllllI[13]], llllllIIl[llllllllI[14]]);
            LIZARD_6 = new GameEnum(llllllIIl[llllllllI[16]], llllllIIl[llllllllI[17]]);
            TORTOISE_1 = new GameEnum(llllllIIl[llllllllI[19]], llllllIIl[llllllllI[20]]);
            TORTOISE_2 = new GameEnum(llllllIIl[llllllllI[22]], llllllIIl[llllllllI[23]]);
            TORTOISE_3 = new GameEnum(llllllIIl[llllllllI[25]], llllllIIl[llllllllI[26]]);
            TORTOISE_4 = new GameEnum(llllllIIl[llllllllI[28]], llllllIIl[llllllllI[29]]);
            TORTOISE_5 = new GameEnum(llllllIIl[llllllllI[31]], llllllIIl[llllllllI[32]]);
            TORTOISE_6 = new GameEnum(llllllIIl[llllllllI[34]], llllllIIl[llllllllI[35]]);
            DRAGON_1 = new GameEnum(llllllIIl[llllllllI[37]], llllllIIl[llllllllI[38]]);
            DRAGON_2 = new GameEnum(llllllIIl[llllllllI[40]], llllllIIl[llllllllI[41]]);
            DRAGON_3 = new GameEnum(llllllIIl[llllllllI[43]], llllllIIl[llllllllI[44]]);
            DRAGON_4 = new GameEnum(llllllIIl[llllllllI[46]], llllllIIl[llllllllI[47]]);
            DRAGON_5 = new GameEnum(llllllIIl[llllllllI[49]], llllllIIl[llllllllI[50]]);
            DRAGON_6 = new GameEnum(llllllIIl[llllllllI[52]], llllllIIl[llllllllI[53]]);
            WYVERN_1 = new GameEnum(llllllIIl[llllllllI[55]], llllllIIl[llllllllI[56]]);
            WYVERN_2 = new GameEnum(llllllIIl[llllllllI[58]], llllllIIl[llllllllI[59]]);
            WYVERN_3 = new GameEnum(llllllIIl[llllllllI[61]], llllllIIl[llllllllI[62]]);
            WYVERN_4 = new GameEnum(llllllIIl[llllllllI[64]], llllllIIl[llllllllI[65]]);
            WYVERN_5 = new GameEnum(llllllIIl[llllllllI[67]], llllllIIl[llllllllI[68]]);
            WYVERN_6 = new GameEnum(llllllIIl[llllllllI[70]], llllllIIl[llllllllI[71]]);
            SNAIL_1 = new GameEnum(llllllIIl[llllllllI[73]], llllllIIl[llllllllI[74]]);
            SNAIL_2 = new GameEnum(llllllIIl[llllllllI[76]], llllllIIl[llllllllI[77]]);
            SNAIL_3 = new GameEnum(llllllIIl[llllllllI[79]], llllllIIl[llllllllI[80]]);
            SNAIL_4 = new GameEnum(llllllIIl[llllllllI[82]], llllllIIl[llllllllI[83]]);
            SNAIL_5 = new GameEnum(llllllIIl[llllllllI[85]], llllllIIl[llllllllI[86]]);
            SNAIL_6 = new GameEnum(llllllIIl[llllllllI[88]], llllllIIl[llllllllI[89]]);
            SNAKE_1 = new GameEnum(llllllIIl[llllllllI[91]], llllllIIl[llllllllI[92]]);
            SNAKE_2 = new GameEnum(llllllIIl[llllllllI[94]], llllllIIl[llllllllI[95]]);
            SNAKE_3 = new GameEnum(llllllIIl[llllllllI[97]], llllllIIl[llllllllI[98]]);
            SNAKE_4 = new GameEnum(llllllIIl[llllllllI[100]], llllllIIl[llllllllI[101]]);
            SNAKE_5 = new GameEnum(llllllIIl[llllllllI[103]], llllllIIl[llllllllI[104]]);
            SNAKE_6 = new GameEnum(llllllIIl[llllllllI[106]], llllllIIl[llllllllI[107]]);
            SLUG_1 = new GameEnum(llllllIIl[llllllllI[109]], llllllIIl[llllllllI[110]]);
            SLUG_2 = new GameEnum(llllllIIl[llllllllI[112]], llllllIIl[llllllllI[113]]);
            SLUG_3 = new GameEnum(llllllIIl[llllllllI[115]], llllllIIl[llllllllI[116]]);
            SLUG_4 = new GameEnum(llllllIIl[llllllllI[118]], llllllIIl[llllllllI[119]]);
            SLUG_5 = new GameEnum(llllllIIl[llllllllI[121]], llllllIIl[llllllllI[122]]);
            SLUG_6 = new GameEnum(llllllIIl[llllllllI[124]], llllllIIl[llllllllI[125]]);
            MONKEY_1 = new GameEnum(llllllIIl[llllllllI[127]], llllllIIl[llllllllI[128]]);
            MONKEY_2 = new GameEnum(llllllIIl[llllllllI[130]], llllllIIl[llllllllI[131]]);
            MONKEY_3 = new GameEnum(llllllIIl[llllllllI[133]], llllllIIl[llllllllI[134]]);
            MONKEY_4 = new GameEnum(llllllIIl[llllllllI[136]], llllllIIl[llllllllI[137]]);
            MONKEY_5 = new GameEnum(llllllIIl[llllllllI[139]], llllllIIl[llllllllI[140]]);
            MONKEY_6 = new GameEnum(llllllIIl[llllllllI[142]], llllllIIl[llllllllI[143]]);
            KALPHITE_1 = new GameEnum(llllllIIl[llllllllI[145]], llllllIIl[llllllllI[146]]);
            KALPHITE_2 = new GameEnum(llllllIIl[llllllllI[148]], llllllIIl[llllllllI[149]]);
            KALPHITE_3 = new GameEnum(llllllIIl[llllllllI[151]], llllllIIl[llllllllI[152]]);
            KALPHITE_4 = new GameEnum(llllllIIl[llllllllI[154]], llllllIIl[llllllllI[155]]);
            KALPHITE_5 = new GameEnum(llllllIIl[llllllllI[157]], llllllIIl[llllllllI[158]]);
            KALPHITE_6 = new GameEnum(llllllIIl[llllllllI[160]], llllllIIl[llllllllI[161]]);
            TERRORBIRD_1 = new GameEnum(llllllIIl[llllllllI[163]], llllllIIl[llllllllI[164]]);
            TERRORBIRD_2 = new GameEnum(llllllIIl[llllllllI[166]], llllllIIl[llllllllI[167]]);
            TERRORBIRD_3 = new GameEnum(llllllIIl[llllllllI[169]], llllllIIl[llllllllI[170]]);
            TERRORBIRD_4 = new GameEnum(llllllIIl[llllllllI[172]], llllllIIl[llllllllI[173]]);
            TERRORBIRD_5 = new GameEnum(llllllIIl[llllllllI[175]], llllllIIl[llllllllI[176]]);
            TERRORBIRD_6 = new GameEnum(llllllIIl[llllllllI[178]], llllllIIl[llllllllI[179]]);
            PENGUIN_1 = new GameEnum(llllllIIl[llllllllI[181]], llllllIIl[llllllllI[182]]);
            PENGUIN_2 = new GameEnum(llllllIIl[llllllllI[184]], llllllIIl[llllllllI[185]]);
            PENGUIN_3 = new GameEnum(llllllIIl[llllllllI[187]], llllllIIl[llllllllI[188]]);
            PENGUIN_4 = new GameEnum(llllllIIl[llllllllI[190]], llllllIIl[llllllllI[191]]);
            PENGUIN_5 = new GameEnum(llllllIIl[llllllllI[193]], llllllIIl[llllllllI[194]]);
            PENGUIN_6 = new GameEnum(llllllIIl[llllllllI[196]], llllllIIl[llllllllI[197]]);
            MOLE_1 = new GameEnum(llllllIIl[llllllllI[199]], llllllIIl[llllllllI[200]]);
            MOLE_2 = new GameEnum(llllllIIl[llllllllI[202]], llllllIIl[llllllllI[203]]);
            MOLE_3 = new GameEnum(llllllIIl[llllllllI[205]], llllllIIl[llllllllI[206]]);
            MOLE_4 = new GameEnum(llllllIIl[llllllllI[208]], llllllIIl[llllllllI[209]]);
            MOLE_5 = new GameEnum(llllllIIl[llllllllI[211]], llllllIIl[llllllllI[212]]);
            MOLE_6 = new GameEnum(llllllIIl[llllllllI[214]], llllllIIl[llllllllI[215]]);
            CAMEL_1 = new GameEnum(llllllIIl[llllllllI[217]], llllllIIl[llllllllI[218]]);
            CAMEL_2 = new GameEnum(llllllIIl[llllllllI[220]], llllllIIl[llllllllI[221]]);
            CAMEL_3 = new GameEnum(llllllIIl[llllllllI[223]], llllllIIl[llllllllI[224]]);
            CAMEL_4 = new GameEnum(llllllIIl[llllllllI[226]], llllllIIl[llllllllI[227]]);
            CAMEL_5 = new GameEnum(llllllIIl[llllllllI[229]], llllllIIl[llllllllI[230]]);
            CAMEL_6 = new GameEnum(llllllIIl[llllllllI[232]], llllllIIl[llllllllI[233]]);
            LEECH_1 = new GameEnum(llllllIIl[llllllllI[235]], llllllIIl[llllllllI[236]]);
            LEECH_2 = new GameEnum(llllllIIl[llllllllI[238]], llllllIIl[llllllllI[239]]);
            LEECH_3 = new GameEnum(llllllIIl[llllllllI[241]], llllllIIl[llllllllI[242]]);
            LEECH_4 = new GameEnum(llllllIIl[llllllllI[244]], llllllIIl[llllllllI[245]]);
            LEECH_5 = new GameEnum(llllllIIl[llllllllI[247]], llllllIIl[llllllllI[248]]);
            LEECH_6 = new GameEnum(llllllIIl[llllllllI[250]], llllllIIl[llllllllI[251]]);
            i[] iArray = new i[llllllllI[84]];
            iArray[i.llllllllI[0]] = LIZARD_1;
            iArray[i.llllllllI[1]] = LIZARD_2;
            iArray[i.llllllllI[2]] = LIZARD_3;
            iArray[i.llllllllI[3]] = LIZARD_4;
            iArray[i.llllllllI[4]] = LIZARD_5;
            iArray[i.llllllllI[5]] = LIZARD_6;
            iArray[i.llllllllI[6]] = TORTOISE_1;
            iArray[i.llllllllI[7]] = TORTOISE_2;
            iArray[i.llllllllI[8]] = TORTOISE_3;
            iArray[i.llllllllI[9]] = TORTOISE_4;
            iArray[i.llllllllI[10]] = TORTOISE_5;
            iArray[i.llllllllI[11]] = TORTOISE_6;
            iArray[i.llllllllI[12]] = DRAGON_1;
            iArray[i.llllllllI[13]] = DRAGON_2;
            iArray[i.llllllllI[14]] = DRAGON_3;
            iArray[i.llllllllI[15]] = DRAGON_4;
            iArray[i.llllllllI[16]] = DRAGON_5;
            iArray[i.llllllllI[17]] = DRAGON_6;
            iArray[i.llllllllI[18]] = WYVERN_1;
            iArray[i.llllllllI[19]] = WYVERN_2;
            iArray[i.llllllllI[20]] = WYVERN_3;
            iArray[i.llllllllI[21]] = WYVERN_4;
            iArray[i.llllllllI[22]] = WYVERN_5;
            iArray[i.llllllllI[23]] = WYVERN_6;
            iArray[i.llllllllI[24]] = SNAIL_1;
            iArray[i.llllllllI[25]] = SNAIL_2;
            iArray[i.llllllllI[26]] = SNAIL_3;
            iArray[i.llllllllI[27]] = SNAIL_4;
            iArray[i.llllllllI[28]] = SNAIL_5;
            iArray[i.llllllllI[29]] = SNAIL_6;
            iArray[i.llllllllI[30]] = SNAKE_1;
            iArray[i.llllllllI[31]] = SNAKE_2;
            iArray[i.llllllllI[32]] = SNAKE_3;
            iArray[i.llllllllI[33]] = SNAKE_4;
            iArray[i.llllllllI[34]] = SNAKE_5;
            iArray[i.llllllllI[35]] = SNAKE_6;
            iArray[i.llllllllI[36]] = SLUG_1;
            iArray[i.llllllllI[37]] = SLUG_2;
            iArray[i.llllllllI[38]] = SLUG_3;
            iArray[i.llllllllI[39]] = SLUG_4;
            iArray[i.llllllllI[40]] = SLUG_5;
            iArray[i.llllllllI[41]] = SLUG_6;
            iArray[i.llllllllI[42]] = MONKEY_1;
            iArray[i.llllllllI[43]] = MONKEY_2;
            iArray[i.llllllllI[44]] = MONKEY_3;
            iArray[i.llllllllI[45]] = MONKEY_4;
            iArray[i.llllllllI[46]] = MONKEY_5;
            iArray[i.llllllllI[47]] = MONKEY_6;
            iArray[i.llllllllI[48]] = KALPHITE_1;
            iArray[i.llllllllI[49]] = KALPHITE_2;
            iArray[i.llllllllI[50]] = KALPHITE_3;
            iArray[i.llllllllI[51]] = KALPHITE_4;
            iArray[i.llllllllI[52]] = KALPHITE_5;
            iArray[i.llllllllI[53]] = KALPHITE_6;
            iArray[i.llllllllI[54]] = TERRORBIRD_1;
            iArray[i.llllllllI[55]] = TERRORBIRD_2;
            iArray[i.llllllllI[56]] = TERRORBIRD_3;
            iArray[i.llllllllI[57]] = TERRORBIRD_4;
            iArray[i.llllllllI[58]] = TERRORBIRD_5;
            iArray[i.llllllllI[59]] = TERRORBIRD_6;
            iArray[i.llllllllI[60]] = PENGUIN_1;
            iArray[i.llllllllI[61]] = PENGUIN_2;
            iArray[i.llllllllI[62]] = PENGUIN_3;
            iArray[i.llllllllI[63]] = PENGUIN_4;
            iArray[i.llllllllI[64]] = PENGUIN_5;
            iArray[i.llllllllI[65]] = PENGUIN_6;
            iArray[i.llllllllI[66]] = MOLE_1;
            iArray[i.llllllllI[67]] = MOLE_2;
            iArray[i.llllllllI[68]] = MOLE_3;
            iArray[i.llllllllI[69]] = MOLE_4;
            iArray[i.llllllllI[70]] = MOLE_5;
            iArray[i.llllllllI[71]] = MOLE_6;
            iArray[i.llllllllI[72]] = CAMEL_1;
            iArray[i.llllllllI[73]] = CAMEL_2;
            iArray[i.llllllllI[74]] = CAMEL_3;
            iArray[i.llllllllI[75]] = CAMEL_4;
            iArray[i.llllllllI[76]] = CAMEL_5;
            iArray[i.llllllllI[77]] = CAMEL_6;
            iArray[i.llllllllI[78]] = LEECH_1;
            iArray[i.llllllllI[79]] = LEECH_2;
            iArray[i.llllllllI[80]] = LEECH_3;
            iArray[i.llllllllI[81]] = LEECH_4;
            iArray[i.llllllllI[82]] = LEECH_5;
            iArray[i.llllllllI[83]] = LEECH_6;
            $VALUES = iArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            i[] iArray2 = i.values();
            int n2 = iArray2.length;
            int lIlIIlIIIIIIl = llllllllI[0];
            while (i.llIllIIIlllI(lIlIIlIIIIIIl, (int)lIlIIlIIIIIlI)) {
                void lIlIIlIIIIlII;
                void lIlIIlIIIIIll;
                void lIlIIlIIIIIII = lIlIIlIIIIIll[lIlIIlIIIIIIl];
                lIlIIlIIIIlII.put((Object)lIlIIlIIIIIII.question, (Object)lIlIIlIIIIIII.answer);

                ++lIlIIlIIIIIIl;

                if (-1 <= 0) continue;
                break block1;
            }
            MATCHES = builder.build();
        }
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

        return String.valueOf(lIlIIIllIIllI);
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }
}

