package me.daffakurnia.android.firstsubmission

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var username: String?,
    var name: String?,
    var photo: Int?
) : Parcelable
