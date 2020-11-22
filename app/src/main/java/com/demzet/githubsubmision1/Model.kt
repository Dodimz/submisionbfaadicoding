package com.demzet.githubsubmision1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
class Model(
    val Username: String,
    val Name: String,
    val Avatar: Int,
    val Company: String,
    val Location: String,
    val Repository: String,
    val Follower: String,
    val Following: String
) : Parcelable