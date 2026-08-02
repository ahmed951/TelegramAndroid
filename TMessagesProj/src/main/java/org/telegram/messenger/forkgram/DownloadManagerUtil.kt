package org.telegram.messenger.forkgram

import android.app.DownloadManager
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
<<<<<<< HEAD
import android.net.Uri
import android.os.Environment
import android.widget.Toast

class DownloadManagerUtil(private val mContext: Context) {

    fun checkDownloadManagerEnable():Boolean {
        try {
            val state = mContext.packageManager.getApplicationEnabledSetting("com.android.providers.downloads")
            if (state == PackageManager.COMPONENT_ENABLED_STATE_DISABLED
                    || state == PackageManager.COMPONENT_ENABLED_STATE_DISABLED_USER
                    || state == PackageManager.COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED) {
                val packageName = "com.android.providers.downloads"
                try {
                    val intent = Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                    intent.data = Uri.parse("package:$packageName")
                    mContext.startActivity(intent)
                } catch (e: ActivityNotFoundException) {
                    e.printStackTrace()
=======
import android.os.Environment
import android.util.Log
import android.widget.Toast
import androidx.core.net.toUri

class DownloadManagerUtil(private val mContext: Context) {

    private companion object {
        const val TAG = "DownloadManagerUtil"
        const val DOWNLOADS_PROVIDER = "com.android.providers.downloads"
    }

    fun checkDownloadManagerEnable(): Boolean {
        try {
            val state = mContext.packageManager.getApplicationEnabledSetting(DOWNLOADS_PROVIDER)
            if (state == PackageManager.COMPONENT_ENABLED_STATE_DISABLED
                || state == PackageManager.COMPONENT_ENABLED_STATE_DISABLED_USER
                || state == PackageManager.COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED) {
                try {
                    val intent = Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                    intent.data = "package:$DOWNLOADS_PROVIDER".toUri()
                    mContext.startActivity(intent)
                } catch (e: ActivityNotFoundException) {
                    Log.e(TAG, "Download manager error", e)
>>>>>>> upstream/dev
                    val intent = Intent(android.provider.Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS)
                    mContext.startActivity(intent)
                }
                return false
            }
<<<<<<< HEAD
        } catch (e:Exception) {
            e.printStackTrace()
=======
        } catch (e: Exception) {
            Log.e(TAG, "Download manager error", e)
>>>>>>> upstream/dev
            return false
        }
        return true
    }

    fun download(url: String, title: String, desc: String): Long {
<<<<<<< HEAD
        val uri = Uri.parse(url)
=======
        val uri = url.toUri()
>>>>>>> upstream/dev
        val req = DownloadManager.Request(uri)
        req.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE or DownloadManager.Request.NETWORK_WIFI)
        req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)

        req.setDestinationInExternalFilesDir(mContext, Environment.DIRECTORY_DOWNLOADS, "$title.apk")

        req.setTitle(title)
        req.setDescription(desc)
        req.setMimeType("application/vnd.android.package-archive")
<<<<<<< HEAD
        req.allowScanningByMediaScanner()
        req.setVisibleInDownloadsUi(true)
=======
>>>>>>> upstream/dev
        val dm = mContext.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager

        return try {
            dm.enqueue(req)
        } catch (e: Exception) {
            Toast.makeText(mContext, "Can't find the download file.", Toast.LENGTH_SHORT).show()
            -1
        }
    }

    fun clearCurrentTask(downloadId: Long) {
        val dm = mContext.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        try {
            dm.remove(downloadId)
        } catch (ex: IllegalArgumentException) {
<<<<<<< HEAD
            ex.printStackTrace()
=======
            Log.e(TAG, "Failed to remove download task", ex)
>>>>>>> upstream/dev
        }
    }
}
