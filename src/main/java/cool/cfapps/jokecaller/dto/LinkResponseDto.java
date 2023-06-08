package cool.cfapps.jokecaller.dto;

public record LinkResponseDto(
        long id,
        long category,
        String title,
        String url,
        String description,
        boolean support,
        String contact,
        String image,
        int likes,
        int dislikes,
        boolean active,
        String categoryTitle
) {
}
