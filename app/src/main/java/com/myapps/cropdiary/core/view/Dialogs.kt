package com.myapps.cropdiary.core.view

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AlertDialog
import com.myapps.cropdiary.R
import javax.inject.Inject

class Dialogs @Inject constructor(private val context: Context) {
    fun showErrorAlert(message: String) {
        val dialog = AlertDialog.Builder(context)
        dialog.setTitle(R.string.error)
        dialog.setMessage(message)
        dialog.setPositiveButton(R.string.accept, null)
        dialog.create()
        dialog.show()
    }

    fun showSuccesAlert(message: String, metodo: Function1<Context, Unit>) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(R.string.succes)
        builder.setMessage(message)
        builder.setPositiveButton(R.string.accept) { _, _ -> metodo(context) }
        val dialog = builder.create()
        dialog.show()
    }

    fun showSuccesAlert(message: String) {
        val dialog = AlertDialog.Builder(context)
        dialog.setTitle(R.string.succes)
        dialog.setMessage(message)
        dialog.setPositiveButton(R.string.accept, null)
        dialog.create()
        dialog.show()
    }
}