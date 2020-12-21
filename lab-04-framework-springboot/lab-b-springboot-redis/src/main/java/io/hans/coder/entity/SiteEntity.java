package io.hans.coder.entity;


import lombok.*;

import java.io.Serializable;

/**
 * @描述 站点
 * @author Hans
 * @created 2020/12/19 15:47
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SiteEntity implements Serializable {

    private static final long serialVersionUID = 7435329368517577340L;

    private String siteCode;

    private String siteName;

    private Double lon;

    private Double lat;

}
