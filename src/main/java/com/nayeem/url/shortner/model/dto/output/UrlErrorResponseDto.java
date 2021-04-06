/**
 * @Since Apr 1, 2021
 * @Author Nayeemul Islam
 * @Project url-shortner
 * @Package com.nayeem.url.shortner.model.dto.output
 */
package com.nayeem.url.shortner.model.dto.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Nayeem
 *
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UrlErrorResponseDto
{
    private String status;
    private String error;
}

