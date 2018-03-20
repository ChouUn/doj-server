package models

import java.time.OffsetDateTime


case class Role(id: Int, name: String,
                createdAt: OffsetDateTime, updatedAt: OffsetDateTime, version: Int)