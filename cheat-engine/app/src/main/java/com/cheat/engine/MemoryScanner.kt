package com.cheat.engine
import java.io.File
import java.io.RandomAccessFile
class MemoryScanner(private val pid: Int) {
    private val memFile = RandomAccessFile("/proc/$pid/mem", "rw")
    private val mapsFile = File("/proc/$pid/maps")
