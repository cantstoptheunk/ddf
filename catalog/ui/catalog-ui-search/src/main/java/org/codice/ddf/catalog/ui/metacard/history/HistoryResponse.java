/**
 * Copyright (c) Codice Foundation
 *
 * <p>This is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or any later version.
 *
 * <p>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details. A copy of the GNU Lesser General Public
 * License is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 */
package org.codice.ddf.catalog.ui.metacard.history;

import java.time.Instant;
import java.util.Date;

public class HistoryResponse {
  private Instant versioned;

  private String originalId, versionId, editedBy, title, created;

  public HistoryResponse(String historyId, String editedBy, Instant versioned) {
    this.versionId = historyId;
    this.editedBy = editedBy;
    this.versioned = versioned;
  }

  public HistoryResponse(String historyId, String editedBy, Date versioned) {
    this(historyId, editedBy, versioned.toInstant());
  }

  public HistoryResponse(
      String historyId, String editedBy, String id, String title, String created, Date versioned) {
    this.versionId = historyId;
    this.editedBy = editedBy;
    this.versioned = versioned.toInstant();
    this.originalId = id;
    this.title = title;
    this.created = created;
  }

  public Instant getVersioned() {
    return versioned;
  }

  public void setVersioned(Instant versioned) {
    this.versioned = versioned;
  }

  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String id) {
    this.versionId = id;
  }

  public String getEditedBy() {
    return editedBy;
  }

  public void setEditedBy(String editedBy) {
    this.editedBy = editedBy;
  }

  public String getOriginalId() {
    return originalId;
  }

  public void setOriginalId(String id) {
    this.originalId = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }
}
