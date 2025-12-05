/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.math.BigInteger;
import java.util.List;
import net.runelite.api.Node;

public interface Buffer
extends Node {
    public byte[] getPayload();

    public int getOffset();

    public void setOffset(int var1);

    public boolean checkCrc();

    public void encryptRsa(BigInteger var1, BigInteger var2);

    public int packBytesToInt();

    public boolean readBoolean();

    public byte readByte();

    public byte readByteAdd();

    public byte readByteNeg();

    public byte readByteSub();

    public void readBytes(byte[] var1, int var2, int var3);

    public void readBytesLE(byte[] var1, int var2, int var3);

    public String readCESU8();

    public int readIncrSmallSmart();

    public int readInt();

    public int readLargeSmart();

    public long readLong();

    public int readMedium();

    public int readNullableLargeSmart();

    public int readShort();

    public int readShortAdd();

    public int readShortAddLE();

    public int readShortLE();

    public int readShortSmartSub();

    public int readShortSmartSub64();

    public String readStringCp1252NullCircumfixed();

    public String readStringCp1252NullTerminated();

    public String readStringCp1252NullTerminatedOrNull();

    public int readUShortSmart();

    public int readUnsignedByte();

    public int readUnsignedByteAdd();

    public int readUnsignedByteNeg();

    public int readUnsignedByteSub();

    public int readUnsignedIntIME();

    public int readUnsignedIntLE();

    public int readUnsignedIntME();

    public int readUnsignedMediumLME();

    public int readUnsignedMediumRME();

    public int readUnsignedShort();

    public int readUnsignedShortAdd();

    public int readUnsignedShortAddLE();

    public int readUnsignedShortLE();

    public int readVarInt();

    public void releaseArray();

    public void writeBoolean(boolean var1);

    public void writeBuffer(Buffer var1);

    public void writeByte(int var1);

    public void writeByteAdd(int var1);

    public void writeByteNeg(int var1);

    public void writeByteSub(int var1);

    public void writeBytes(byte[] var1, int var2, int var3);

    public void writeCESU8(CharSequence var1);

    public int writeCrc(int var1);

    public void writeInt(int var1);

    public void writeIntIME(int var1);

    public void writeIntLE(int var1);

    public void writeIntME(int var1);

    public void writeLengthByte(int var1);

    public void writeLengthInt(int var1);

    public void writeLengthShort(int var1);

    public void writeLong(long var1);

    public void writeLongMedium(long var1);

    public void writeMedium(int var1);

    public void writeMediumME(int var1);

    public void writeShort(int var1);

    public void writeShortAdd(int var1);

    public void writeShortAddLE(int var1);

    public void writeShortLE(int var1);

    public void writeSmartByteShort(int var1);

    public void writeStringCp1252NullCircumfixed(String var1);

    public void writeStringCp1252NullTerminated(String var1);

    public void writeVarInt(int var1);

    public void xteaDecrypt(int[] var1, int var2, int var3);

    public void xteaDecryptAll(int[] var1);

    public void xteaEncrypt(int[] var1, int var2, int var3);

    public List<Object> getWrites();
}

