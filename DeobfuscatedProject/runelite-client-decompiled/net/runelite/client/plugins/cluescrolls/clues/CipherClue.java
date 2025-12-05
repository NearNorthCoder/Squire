/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.NPCComposition
 *  net.runelite.api.coords.WorldPoint
 */
package net.runelite.client.plugins.cluescrolls.clues;

import com.google.common.collect.ImmutableList;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;
import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.cluescrolls.ClueScrollOverlay;
import net.runelite.client.plugins.cluescrolls.ClueScrollPlugin;
import net.runelite.client.plugins.cluescrolls.clues.ClueScroll;
import net.runelite.client.plugins.cluescrolls.clues.LocationClueScroll;
import net.runelite.client.plugins.cluescrolls.clues.NpcClueScroll;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class CipherClue
extends ClueScroll
implements NpcClueScroll,
LocationClueScroll {
    static final List<CipherClue> CLUES = ImmutableList.of(new CipherClue("BMJ UIF LFCBC TFMMFS", 11875, new WorldPoint(3354, 2974, 0), "Pollnivneach", "How many coins would you need to purchase 133 kebabs from me?", "399"), new CipherClue("GUHCHO", 9636, new WorldPoint(3440, 9895, 0), "Paterdomus", "Please solve this for x: 7x - 28=21", "7"), new CipherClue("HQNM LZM STSNQ", 311, new WorldPoint(3227, 3227, 0), "Outside Lumbridge castle", "How many snakeskins are needed in order to craft 44 boots, 29 vambraces and 34 bandanas?", "666"), new CipherClue("ZHLUG ROG PDQ", 954, new WorldPoint(3224, 3112, 0), "Kalphite Lair entrance. Fairy ring BIQ", "SIX LEGS! All of them have 6! There are 25 of them! How many legs?", "150"), new CipherClue("ECRVCKP MJCNGF", 6971, new WorldPoint(1845, 3754, 0), "Large eastern building in Port Piscarilius", "How many fishing cranes can you find around here?", "5"), new CipherClue("OVEXON", 5304, new WorldPoint(2289, 3144, 0), "Outside Lletya or in Prifddinas after Song of the Elves", "A question on elven crystal math. I have 5 and 3 crystals, large and small respectively. A large crystal is worth 10,000 coins and a small is worth but 1,000. How much are all my crystals worth?", "53,000"), new CipherClue("VTYR APCNTGLW", 4058, new WorldPoint(2634, 4682, 1), "Fisher Realm, first floor. Fairy ring BJR", "How many cannons are on this here castle?", "5"), new CipherClue("UZZU MUJHRKYYKJ", 2914, new WorldPoint(2501, 3487, 0), "Otto's Grotto", "How many pyre sites are found around this lake?", "3"), new CipherClue("XJABSE USBJCPSO", 5081, new WorldPoint(3112, 3162, 0), "First floor of Wizards Tower. Fairy ring DIS", "How many air runes would I need to cast 630 wind waves?", "3150"), new CipherClue("HCKTA IQFHCVJGT", 1840, new WorldPoint(2446, 4428, 0), "Zanaris throne room", "There are 3 inputs and 4 letters on each ring How many total individual fairy ring codes are possible?", "64"), new CipherClue("ZSBKDO ZODO", 601, new WorldPoint(3680, 3537, 0), "Dock northeast of the Ectofuntus"), new CipherClue("GBJSZ RVFFO", 1161, new WorldPoint(2347, 4435, 0), "Fairy Resistance Hideout"), new CipherClue[]{new CipherClue("QSPGFTTPS HSBDLMFCPOF", 7048, new WorldPoint(1625, 3802, 0), "Ground floor of Arceuus Library", "How many round tables can be found on this floor of the library?", "9"), new CipherClue("IWPPLQTP", 2153, new WorldPoint(2541, 3548, 0), "Barbarian Outpost Agility course"), new CipherClue("BSOPME MZETQPS", 4293, new WorldPoint(2329, 3689, 0), "Piscatoris Fishing Colony general store/bank"), new CipherClue("ESBZOPS QJH QFO", new WorldPoint(3077, 3260, 0), "Inside of Martin the Master Gardener's pig pen in Draynor Village."), new CipherClue("BXJA UNJMNA YRCAR", 13135, new WorldPoint(1559, 3045, 0), "Top of the Hunter Guild")});
    private final String text;
    private final int npcId;
    private final WorldPoint location;
    private final String area;
    @Nullable
    private final String question;
    @Nullable
    private final String answer;

    private CipherClue(String text, WorldPoint location, String area) {
        this.text = "The cipher reveals where to dig next: " + text;
        this.npcId = -1;
        this.location = location;
        this.area = area;
        this.question = null;
        this.answer = null;
    }

    private CipherClue(String text, int npcId, WorldPoint location, String area) {
        this(text, npcId, location, area, null, null);
    }

    private CipherClue(String text, int npcId, WorldPoint location, String area, @Nullable String question, @Nullable String answer) {
        this.text = "The cipher reveals who to speak to next: " + text;
        this.npcId = npcId;
        this.location = location;
        this.area = area;
        this.question = question;
        this.answer = answer;
    }

    @Override
    public WorldPoint getLocation(ClueScrollPlugin plugin) {
        return this.location;
    }

    @Override
    public void makeOverlayHint(PanelComponent panelComponent, ClueScrollPlugin plugin) {
        panelComponent.getChildren().add(TitleComponent.builder().text("Cipher Clue").build());
        NPCComposition npc = this.getNpcComposition(plugin);
        if (npc != null) {
            panelComponent.getChildren().add(LineComponent.builder().left("NPC:").build());
            panelComponent.getChildren().add(LineComponent.builder().left(npc.getName()).leftColor(ClueScrollOverlay.TITLED_CONTENT_COLOR).build());
        }
        panelComponent.getChildren().add(LineComponent.builder().left("Location:").build());
        panelComponent.getChildren().add(LineComponent.builder().left(this.getArea()).leftColor(ClueScrollOverlay.TITLED_CONTENT_COLOR).build());
        if (this.getAnswer() != null) {
            panelComponent.getChildren().add(LineComponent.builder().left("Answer:").build());
            panelComponent.getChildren().add(LineComponent.builder().left(this.getAnswer()).leftColor(ClueScrollOverlay.TITLED_CONTENT_COLOR).build());
        }
        this.renderOverlayNote(panelComponent, plugin);
    }

    @Override
    public void makeWorldOverlayHint(Graphics2D graphics, ClueScrollPlugin plugin) {
        if (!this.getLocation().isInScene(plugin.getClient())) {
            return;
        }
        if (plugin.getNpcsToMark() != null) {
            for (NPC npc : plugin.getNpcsToMark()) {
                OverlayUtil.renderActorOverlayImage(graphics, (Actor)npc, plugin.getClueScrollImage(), Color.ORANGE, 30);
            }
        }
    }

    public static CipherClue forText(String text) {
        for (CipherClue clue : CLUES) {
            if (!text.equalsIgnoreCase(clue.text) && !text.equalsIgnoreCase(clue.question)) continue;
            return clue;
        }
        return null;
    }

    @Override
    public String[] getNpcs(ClueScrollPlugin plugin) {
        NPCComposition comp = this.getNpcComposition(plugin);
        return new String[]{comp == null ? null : comp.getName()};
    }

    @Override
    public int[] getConfigKeys() {
        return new int[]{this.text.hashCode()};
    }

    private NPCComposition getNpcComposition(ClueScrollPlugin plugin) {
        if (this.npcId == -1) {
            return null;
        }
        NPCComposition composition = plugin.getClient().getNpcDefinition(this.npcId);
        if (composition.getConfigs() != null) {
            composition = composition.transform();
        }
        return composition;
    }

    public String getText() {
        return this.text;
    }

    public int getNpcId() {
        return this.npcId;
    }

    public String getArea() {
        return this.area;
    }

    @Nullable
    public String getQuestion() {
        return this.question;
    }

    @Nullable
    public String getAnswer() {
        return this.answer;
    }

    private WorldPoint getLocation() {
        return this.location;
    }
}

