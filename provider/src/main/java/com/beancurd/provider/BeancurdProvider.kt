package com.beancurd.provider

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import android.util.Log

/**
 * 测试Provider
 *
 * @author zfc on 2023/3/21
 */
class BeancurdProvider : ContentProvider(){

    override fun onCreate(): Boolean {
        Log.e(TAG, "onCreate() ...")
        return true
    }

    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor? {
        Log.e(TAG, "onCreate() ...")
        return null
    }


    override fun getType(p0: Uri): String? {
        Log.e(TAG, "getType() ...")
        return "Beancurd"
    }

    override fun insert(p0: Uri, p1: ContentValues?): Uri? {
        Log.e(TAG, "insert() ...")
        return Uri.EMPTY
    }

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int {
        Log.e(TAG, "delete() ...")
        return 1
    }

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int {
        Log.e(TAG, "update() ...")
        return 3
    }

    companion object {
        const val TAG = "BeancurdProvider"
    }
}