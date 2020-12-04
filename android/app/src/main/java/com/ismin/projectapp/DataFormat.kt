package com.ismin.projectapp

import java.io.Serializable

data class DataFormat(
    var nhits: Int,
    val records: List<DataFields>
) : Serializable

data class DataFields(
    var fields: LineData
) : Serializable

data class LineData(
    val status: String,
    val transportmode: String,
    val name_line: String,
    val shortname_groupoflines: String,
    val networkname: String,
    val operatorname: String,
    val accessibility: String
) : Serializable