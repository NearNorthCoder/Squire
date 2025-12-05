/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.SpritePixels
 */
package net.runelite.client.plugins.squire.runepouch;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.SpritePixels;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.game.ItemManager;
import net.runelite.client.util.AsyncBufferedImage;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunePouchSetup {
    private static final Logger log = LoggerFactory.getLogger(RunePouchSetup.class);
    private final Map<Integer, Integer> runes = new HashMap<Integer, Integer>();

    public static RunePouchSetup get() {
        RunePouchSetup rp = new RunePouchSetup();
        if (Game.getState() != GameState.LOGGED_IN) {
            return rp;
        }
        if (!RunePouch.hasPouch()) {
            return rp;
        }
        RunePouch.RuneSlot[] slots = RunePouch.RuneSlot.values();
        int amount = Inventory.getFirst("Rune pouch") == null ? 4 : 3;
        for (int i = 0; i < amount; ++i) {
            RunePouch.RuneSlot slot = slots[i];
            String rName = slot.getRuneName();
            if (slot.getQuantity() == 0 || rName == null) continue;
            Arrays.stream(Rune.values()).filter(r -> {
                for (String n : r.getRuneNames()) {
                    if (!rName.contains(n)) continue;
                    return true;
                }
                return false;
            }).findFirst().ifPresent(r -> {
                if (slot.getQuantity() == 0) {
                    return;
                }
                rp.addRune(r.getRuneId(), slot.getQuantity());
            });
        }
        return rp;
    }

    public BufferedImage render(ItemManager itemManager) {
        BufferedImage background = ImageUtil.loadImageResource(this.getClass(), "pouch.png");
        if (background == null) {
            return null;
        }
        if (this.runes.isEmpty()) {
            return background;
        }
        ClientThread clientThread = Static.getClientThread();
        AsyncBufferedImage canvas = new AsyncBufferedImage(clientThread, background.getWidth(), background.getHeight(), 2);
        Client client = Static.getClient();
        clientThread.invoke(() -> {
            int height = canvas.getHeight() / 2;
            Graphics2D graphics = canvas.createGraphics();
            graphics.drawImage((Image)background, 0, 0, null);
            int count = 1;
            for (Integer itemId : this.runes.keySet()) {
                BufferedImage img = new BufferedImage(36, 32, 2);
                SpritePixels sprite = client.createItemSprite(itemId.intValue(), this.runes.get(itemId).intValue(), 1, 0x302020, 1, false, 512);
                if (sprite == null) {
                    return false;
                }
                sprite.toBufferedImage(img);
                graphics.drawImage((Image)img, canvas.getWidth() / 4 * count++ - img.getWidth(), height - img.getHeight() / 4, null);
            }
            graphics.dispose();
            canvas.loaded();
            return true;
        });
        return canvas;
    }

    public void addRune(int id, int quantity) {
        this.runes.put(id, quantity);
    }

    public Map<Integer, Integer> getRunes() {
        return this.runes;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RunePouchSetup)) {
            return false;
        }
        RunePouchSetup other = (RunePouchSetup)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Map<Integer, Integer> this$runes = this.getRunes();
        Map<Integer, Integer> other$runes = other.getRunes();
        return !(this$runes == null ? other$runes != null : !((Object)this$runes).equals(other$runes));
    }

    protected boolean canEqual(Object other) {
        return other instanceof RunePouchSetup;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Map<Integer, Integer> $runes = this.getRunes();
        result = result * 59 + ($runes == null ? 43 : ((Object)$runes).hashCode());
        return result;
    }

    public String toString() {
        return "RunePouchSetup(runes=" + String.valueOf(this.getRunes()) + ")";
    }
}

