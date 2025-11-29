/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.cox.tasks;

import net.runelite.api.coords.WorldPoint;

/**
 * LayoutNode - Represents a node in the raid layout graph.
 *
 * This class forms part of a doubly-linked structure that represents
 * the raid layout, with each node containing position and direction information
 * along with references to adjacent nodes.
 */
public class LayoutNode {
    private WorldPoint position;
    private final char direction;
    private final int index;
    private LayoutNode previousNode;
    private LayoutNode nextNode;

    /**
     * Creates a new layout node.
     *
     * @param index the index of this node in the layout
     * @param direction the direction character for this node
     */
    LayoutNode(int index, char direction) {
        this.index = index;
        this.direction = direction;
    }

    /**
     * Gets the direction character for this node.
     *
     * @return the direction character (N, S, E, W, etc.)
     */
    public char getDirection() {
        return this.direction;
    }

    /**
     * Sets the previous node in the layout chain.
     *
     * @param node the previous node
     */
    public void setPreviousNode(LayoutNode node) {
        this.previousNode = node;
    }

    /**
     * Gets the previous node in the layout chain.
     *
     * @return the previous node, or null if this is the first node
     */
    public LayoutNode getPreviousNode() {
        return this.previousNode;
    }

    /**
     * Sets the next node in the layout chain.
     *
     * @param node the next node
     */
    public void setNextNode(LayoutNode node) {
        this.nextNode = node;
    }

    /**
     * Gets the index of this node in the layout.
     *
     * @return the node index
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * Gets the next node in the layout chain.
     *
     * @return the next node, or null if this is the last node
     */
    public LayoutNode getNextNode() {
        return this.nextNode;
    }

    /**
     * Sets the position of this node.
     *
     * @param position the world point position
     */
    public void setPosition(WorldPoint position) {
        this.position = position;
    }

    /**
     * Gets the position of this node.
     *
     * @return the world point position
     */
    public WorldPoint getPosition() {
        return this.position;
    }
}
