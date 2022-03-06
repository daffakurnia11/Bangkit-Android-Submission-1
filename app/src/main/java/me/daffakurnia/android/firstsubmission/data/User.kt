package me.daffakurnia.android.firstsubmission.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var username: String?,
    var name: String?,
    var photo: Int?,
    var location: String?,
    var company: String?,
    var followers: Int?,
    var following: Int?,
    var repository: Int?
) : Parcelable
