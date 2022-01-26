/*
 * BIMROCKET
 *
 * Copyright (C) 2022, Ajuntament de Sant Feliu de Llobregat
 *
 * This program is licensed and may be used, modified and redistributed under
 * the terms of the European Public License (EUPL), either version 1.1 or (at
 * your option) any later version as soon as they are approved by the European
 * Commission.
 *
 * Alternatively, you may redistribute and/or modify this program under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either  version 3 of the License, or (at your option)
 * any later version.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the licenses for the specific language governing permissions, limitations
 * and more details.
 *
 * You should have received a copy of the EUPL1.1 and the LGPLv3 licenses along
 * with this program; if not, you may find them at:
 *
 * https://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 * http://www.gnu.org/licenses/
 * and
 * https://www.gnu.org/licenses/lgpl.txt
 */
package org.bimrocket.ihub.repo.filesystem;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.bimrocket.ihub.dto.IdPair;
import org.bimrocket.ihub.repo.IdPairRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

/**
 *
 * @author realor
 */
@Repository
@ConditionalOnProperty(prefix = "data", name="store", havingValue="filesystem")
public class FileSystemIdPairRepository implements IdPairRepository
{
  @Override
  public IdPair save(IdPair idPair)
  {
    return idPair;
  }

  @Override
  public Optional<IdPair> findByInventoryAndObjectTypeAndLocalId(
    String inventory, String objectType, String localId)
  {
    return Optional.empty();
  }

  @Override
  public Optional<IdPair> findByInventoryAndGlobalId(
    String inventory, String globalId)
  {
    return Optional.empty();
  }

  @Override
  public List<IdPair> findByInventoryAndObjectTypeAndLastUpdateLessThan(
    String inventory, String objectType, Date date)
  {
    return Collections.EMPTY_LIST;
  }

  @Override
  public void deleteByInventoryAndObjectTypeAndLocalId(
    String inventory, String objectType, String localId)
  {
  }

  @Override
  public void deleteByInventoryAndGlobalId(
    String inventory, String objectType, String localId)
  {
  }
}