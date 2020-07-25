/**
 * Project Name : generator-commons<br>
 * File Name : ContentResource.java<br>
 * Encoding : UTF-8<br>
 * Creation Date : 2020/07/25<br>
 * <p>
 * Copyright © 2020 Kato Shinya. All rights reserved.
 * <p>
 * This source code or any portion thereof must not be<br>
 * reproduced or used in any manner whatsoever.
 */

package org.thinkit.generator.common.dto.contentgenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * コンテンツのリソース情報を管理するデータクラスです。
 *
 * @author Kato Shinya
 * @since 1.0
 * @version 1.0
 */
@Getter
@ToString
@EqualsAndHashCode
public final class ContentResource {

    /**
     * コンテンツ名
     */
    private String contentName = "";

    /**
     * コンテンツ
     */
    private String content = "";

    /**
     * デフォルトコンストラクタ
     */
    @SuppressWarnings("unused")
    private ContentResource() {
    }

    /**
     * コンストラクタ
     *
     * @param contentName コンテンツ名
     * @param content     コンテンツ
     *
     * @exception NullPointerException 引数として {@code null} が渡された場合
     */
    public ContentResource(@NonNull String contentName, @NonNull String content) {
        this.contentName = contentName;
        this.content = content;
    }
}