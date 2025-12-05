/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;
import net.runelite.rs.api.RSAbstractArchive;
import net.runelite.rs.api.RSMidiPcmStream;

public interface RSMusicTrackDescriptor {
    @Import(value="midiPcmStream")
    public RSMidiPcmStream getMidiPcmStream();

    @Import(value="musicTrackArchive")
    public void setMusicTrackArchive(RSAbstractArchive var1);

    @Import(value="musicTrackGroupId")
    public void setMusicTrackGroupId(int var1);

    @Import(value="musicTrackFileId")
    public void setMusicTrackFileId(int var1);

    @Import(value="musicTrackVolume")
    public void setMusicTrackVolume(int var1);

    @Import(value="musicTrackPlaying")
    public void setMusicTrackPlaying(boolean var1);

    @Import(value="musicTrackGroupId")
    public int getMusicCurrentTrackId();

    @Import(value="musicTrackFileId")
    public int getMusicTrackFileId();
}

