package com.studypilot.app.data.model

data class SubjectWithCounts(
    val subject: Subject,
    val chapterCount: Int = 0,
    val topicCount: Int = 0
) {
    val name: String get() = subject.name
    val colorHex: String get() = subject.colorHex
    val targetGrade: String get() = "${chapterCount} chapters • ${topicCount} topics"
}

data class ChapterWithCounts(
    val chapter: Chapter,
    val topicCount: Int = 0
)
