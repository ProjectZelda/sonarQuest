-- Set the length of the story column to 10000 characters in order to allowe lengthy stories
-- ALTER TABLE Quest ALTER COLUMN Story VARCHAR (8000);
ALTER TABLE public.quest ALTER COLUMN story TYPE character varying (10000);