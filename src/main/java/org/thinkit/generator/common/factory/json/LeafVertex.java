/*
 * Copyright 2020 Kato Shinya.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.thinkit.generator.common.factory.json;

import java.util.ArrayList;
import java.util.List;

import org.thinkit.generator.common.factory.Component;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * JSONの葉頂点を抽象化したクラスです。
 *
 * @author Kato Shinya
 * @since 1.0
 * @version 1.0
 *
 * @see Component
 * @see #createResource()
 */
@ToString
@EqualsAndHashCode
public abstract class LeafVertex implements Component {

    /**
     * ノードグループ
     */
    @Getter(AccessLevel.PROTECTED)
    private List<NodeGroup> nodeGroups;

    /**
     * デフォルトコンストラクタ
     */
    protected LeafVertex() {
        this.nodeGroups = new ArrayList<>(0);
    }

    /**
     * 引数として渡された {@code nodeGroup} オブジェクトをノードグループの集合リストへ追加します。
     *
     * @param nodeGroup ノードグループ
     * @return 自分自身のインスタンス
     *
     * @exception NullPointerException 引数として {@code null} が渡された場合
     */
    public LeafVertex add(@NonNull NodeGroup nodeGroup) {
        this.nodeGroups.add(nodeGroup);
        return this;
    }
}