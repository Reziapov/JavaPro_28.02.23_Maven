CREATE TABLE IF NOT EXISTS public.homework
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    name character varying(100) COLLATE pg_catalog."default",
    description text COLLATE pg_catalog."default",
    CONSTRAINT "Homework_pkey" PRIMARY KEY (id)
    )

CREATE TABLE IF NOT EXISTS public.lesson
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    name character varying(100) COLLATE pg_catalog."default",
    "updatedAt" timestamp with time zone,
                              "homework_id " bigint,
                              CONSTRAINT "Lesson_pkey" PRIMARY KEY (id),
    CONSTRAINT fk_homework_id_lesson FOREIGN KEY ("homework_id ")
    REFERENCES public.homework (id) MATCH SIMPLE
                          ON UPDATE NO ACTION
                          ON DELETE NO ACTION
    )

CREATE TABLE IF NOT EXISTS public.schedule
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    name character varying(100) COLLATE pg_catalog."default",
    "updatedAt" timestamp with time zone,
                              "lessons " character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT schedule_pkey PRIMARY KEY (id),
    CONSTRAINT fk_lessons_schedule FOREIGN KEY (id)
    REFERENCES public.lesson (id) MATCH SIMPLE
                          ON UPDATE NO ACTION
                          ON DELETE NO ACTION
    )

CREATE TABLE IF NOT EXISTS public.lesson_schedule
(
    lesson_id bigint NOT NULL,
    schedule_id bigint NOT NULL,
    CONSTRAINT lesson_schedule_pkey PRIMARY KEY (lesson_id, schedule_id),
    CONSTRAINT fk_lesson_schedule FOREIGN KEY (lesson_id)
    REFERENCES public.lesson (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    CONSTRAINT fk_schedule_lesson FOREIGN KEY (schedule_id)
    REFERENCES public.schedule (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    )