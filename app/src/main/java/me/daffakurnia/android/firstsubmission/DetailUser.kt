package me.daffakurnia.android.firstsubmission

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailUser(
    var photo: Int?,
    var username: String?,
    var name: String?
) : Parcelable
